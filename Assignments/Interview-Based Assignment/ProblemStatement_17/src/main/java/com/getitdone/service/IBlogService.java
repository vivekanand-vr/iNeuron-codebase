package com.getitdone.service;

import java.util.List;

import com.getitdone.model.Blogpost;

public interface IBlogService {
     public String saveBlog(Blogpost bp);
     public List<Blogpost> getAllBlogposts();
}
