package com.springmvc.dao;

import java.util.List;
import com.springmvc.models.*;

public interface PostDAO extends DAOBase<Post> {

	public List<Post> getTopNewest(int top, int topicId);
	
	public List<Post> getInRange(int skip, int take, int topicId);
	
}
