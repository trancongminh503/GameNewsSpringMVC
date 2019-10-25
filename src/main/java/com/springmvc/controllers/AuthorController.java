package com.springmvc.controllers;

import static com.springmvc.models.PostContent.newPostContent;
import static com.springmvc.util.CurrentLogin.id;
import static com.springmvc.util.CurrentLogin.loggingIn;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.models.Post;
import com.springmvc.models.PostContent;
import com.springmvc.models.Tag;
import com.springmvc.models.Topic;
import com.springmvc.services.PostContentService;
import com.springmvc.services.PostService;
import com.springmvc.services.TagService;
import com.springmvc.services.TopicService;

@Controller
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	TopicService topicService;

	@Autowired
	TagService tagService;
	
	@Autowired
	PostContentService postContentService;
	
	@Autowired
	PostService postService;
	
	@Autowired
	ServletContext context;

	// this will trim all data binder pass in
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dataBinder.registerCustomEditor(LocalDate.class, new CustomDateEditor(dateFormat, true));
	}
	
	@ModelAttribute("listTopic")
	public List<Topic> getTopics() {
		List<Topic> listTopic = topicService.getAll();
		return listTopic;
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post(ModelMap model) {

		if (loggingIn == false) {
			return "redirect:/login/";
		}
		
		model.addAttribute("post", new Post());

		return "author/post-news";
	}

	@RequestMapping(value = "/demo-post", method = RequestMethod.POST)
	public String demoPost(ModelMap model, 
			@ModelAttribute Post post,
			@RequestParam String tags,
			@RequestParam MultipartFile imageHeader) {

		String tagArr[] = tags.split(",");

		model.addAttribute("title", post.getTitle());
		model.addAttribute("content", post.getContent());
		model.addAttribute("tagList", tagArr);
		model.addAttribute("topic", post.getTopicId());
		
		PostContent postContent = newPostContent(post.getContent());
		int postContentId = postContentService.save(postContent);
		
		// ======================================== save post =============================================
		String imageSavePath = "/lib/post-image/id" + postContentId + ".jpg";
		try {
			String photoPath = context.getRealPath(imageSavePath);
			System.out.println(photoPath);
			imageHeader.transferTo(new File(photoPath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		post = post.setPost(id, postContentId, imageSavePath);
		int postId = postService.saveWithContent(post, postContent.getContent());
		//===================================================================================================
		
		// ======================= save tags ===========================
		for (int i = 0; i < tagArr.length; i++) {
			Tag tag = new Tag();
			tag.setName(tagArr[i]);
			tag.setTagId(0);
			
			postService.saveTags(postId, tagService.save(tag));
		}
		// =============================================================

		return "author/post-demo";
	}

}
