package com.springmvc.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.dao.TagDAO;
import com.springmvc.models.*;

@Service
@Transactional
public class TagServiceImpl implements TagService {

	@Autowired
	TagDAO tagDAO;
	
	@Override
	public List<Tag> getAll() {
		return tagDAO.getAll();
	}

	@Override
	public Tag getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Tag entity) {
		// TODO Auto-generated method stub
		return tagDAO.save(entity);
	}

	@Override
	public boolean update(Tag entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Tag entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Tag> getByPostId(int postId) {
		return tagDAO.getByPostId(postId);
	}

}
