package com.getitdone.repository;

import java.util.List;

import com.getitdone.model.Blogpost;

public interface IBlogRepo {
	 public String saveBlog(Blogpost bp);
     public List<Blogpost> getAllBlogposts();
}
