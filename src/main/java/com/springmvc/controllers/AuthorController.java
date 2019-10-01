package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.springmvc.models.*;
import com.springmvc.services.TagService;
import com.springmvc.services.TopicService;
import static com.springmvc.util.CurrentLogin.*;

@Controller
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	TopicService topicService;

	@Autowired
	TagService tagService;

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post(ModelMap model) {

		if (id == -1) {
			return "redirect:/login/";
		}
		
		List<Tag> listTag = tagService.getAll();
		model.addAttribute("listTag", listTag);

		List<Topic> listTopic = topicService.getAll();
		model.addAttribute("listTopic", listTopic);

		return "author/post-news";
	}

	@RequestMapping(value = "/create-post", method = RequestMethod.POST)
	public String createPost(ModelMap model, @RequestParam("title") String title,
			@RequestParam("content") String content, @RequestParam("tags") String tags,
			@RequestParam("topic") String topic) {

		String tagArr[] = tags.split(",");

		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("tagList", tagArr);
		model.addAttribute("topic", topic);

		System.out.println(content);

		return "author/post-demo";
	}

}
