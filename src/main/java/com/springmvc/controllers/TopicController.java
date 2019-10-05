package com.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.models.Post;
import com.springmvc.models.Topic;
import com.springmvc.services.PostService;
import com.springmvc.services.TopicService;
import com.springmvc.services.UserService;

@Controller
public class TopicController {

	public final int MAX_POST_PER_PAGE = 10;
	public final int TOP_POST_PER_PAGE = 3;
	
	@Autowired
	TopicService topicService;

	@Autowired
	PostService postService;

	@Autowired
	UserService userService;

//	@ModelAttribute(name = "listTopic")
//	public List<Topic> getListTopic() {
//		List<Topic> listTopic = topicServiceBase.getAll();
//
//		return listTopic;
//	}
//
//	// get top 3 newest post
//	@ModelAttribute(name = "topPost")
//	public List<Post> getTopPost(ModelMap model) {
//
//		List<Post> topNPost = postService.getTopNewest(3, 1);
//
//		List<String> topAuthorName = new ArrayList<>();
//		for (int i = 0; i < topNPost.size(); i++) {
//			topAuthorName.add(authorService.getFullName(topNPost.get(i).getAuthorId()));
//		}
//		model.addAttribute("topAuthorName", topAuthorName);
//
//		return topNPost;
//	}

	@RequestMapping(value = "/{topicName:[a-zA-Z0-9-]+}", method = RequestMethod.GET)
	public String home(ModelMap model, @PathVariable String topicName,
										@RequestParam(defaultValue = "1") int page) {

		// Topic taskbar
		List<Topic> listTopic = topicService.getAll();
		model.addAttribute("listTopic", listTopic);

		model.addAttribute("topic", topicName);
		// Map topicName to topicId
		int topicId = -1;
		topicName = topicName.replace('-', ' ').toUpperCase();
		for (Topic topic : listTopic) {
			if (topic.getName().equals(topicName)) {
				topicId = topic.getTopicId();
				break;
			}
		}
		
		if (topicId != -1) {
			
			int totalPost = postService.count(topicId);
			int pageCount = (totalPost - TOP_POST_PER_PAGE) / MAX_POST_PER_PAGE;
			System.out.println("++++++++++++++++++++++++++++++++++++++++Page count: " + pageCount);
			model.addAttribute("pageCount", pageCount);
			
			// Top newest post
			List<Post> topNPost = postService.getTopNewest(TOP_POST_PER_PAGE, topicId);
			model.addAttribute("topPost", topNPost);

			List<String> topAuthorName = new ArrayList<>();
			for (int i = 0; i < topNPost.size(); i++) {
				topAuthorName.add(userService.getFullName(topNPost.get(i).getUserId()));
			}
			model.addAttribute("topAuthorName", topAuthorName);
			
			// Page post
			int skip = TOP_POST_PER_PAGE + (page - 1) * MAX_POST_PER_PAGE;
			int take = (totalPost - skip) < MAX_POST_PER_PAGE ? (totalPost - skip) : MAX_POST_PER_PAGE;
			List<Post> listPost = postService.getInRange(skip, take, topicId);
			model.addAttribute("listPost", listPost);
			
			List<String> listAuthorName = new ArrayList<>();
			for (int i = 0; i < listPost.size(); i++) {
				listAuthorName.add(userService.getFullName(listPost.get(i).getUserId()));
			}
			model.addAttribute("listAuthorName", listAuthorName);
		}

		return "topic/topic-page";
	}

}
