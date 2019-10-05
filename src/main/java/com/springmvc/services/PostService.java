package com.springmvc.services;

import java.util.List;

import com.springmvc.models.Post;

public interface PostService extends ServiceBase<Post> {
	
	public List<Post> getTopNewest(int top, int topicId);
	
	public List<Post> getInRange(int skip, int take, int topicId);
	
	public boolean saveTags(int postId, int tagId);
	
	public int count(int topicId);
	
	public int saveWithContent(Post post, String postContent);
}
