package com.getitdone.service;

import java.util.List;

import com.getitdone.model.Blogpost;
import com.getitdone.repository.BlogRepoImpl;
import com.getitdone.repository.IBlogRepo;

public class BlogServiceImpl implements IBlogService {

	IBlogRepo repo=new BlogRepoImpl();
	@Override
	public String saveBlog(Blogpost bp) {
		// TODO Auto-generated method stub
		return repo.saveBlog(bp);
	}

	@Override
	public List<Blogpost> getAllBlogposts() {
		// TODO Auto-generated method stub
		return repo.getAllBlogposts();
	}

}
