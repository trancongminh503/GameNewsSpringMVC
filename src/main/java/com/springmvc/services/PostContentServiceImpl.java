package com.springmvc.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.dao.DAOBase;
import com.springmvc.models.PostContent;

@Service
@Transactional
public class PostContentServiceImpl implements ServiceBase<PostContent>{

	@Autowired
	DAOBase<PostContent> postContentDAOBase;
	
	@Override
	public List<PostContent> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostContent getById(int id) {
		// TODO Auto-generated method stub
		return postContentDAOBase.getById(id);
	}

	@Override
	public boolean save(PostContent entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PostContent entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(PostContent entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
