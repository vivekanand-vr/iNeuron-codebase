package com.getitdone.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.getitdone.model.Blogpost;
import com.getitdone.service.BlogServiceImpl;
import com.getitdone.service.IBlogService;

/**
 * Servlet implementation class BlogPost
 */
@WebServlet("/blog")
public class BlogPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	IBlogService service=new BlogServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Blogpost> allBlogposts = service.getAllBlogposts();
		
		HttpSession session = request.getSession();
		session.setAttribute("Blogposts", allBlogposts);
		System.out.println(allBlogposts);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./read.jsp");
		dispatcher.forward(request, response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String content = request.getParameter("content");
		Blogpost post=new Blogpost(title,description,content);
		String result = service.saveBlog(post);
		
		HttpSession session = request.getSession();
		session.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./saveResult.jsp");
		dispatcher.forward(request, response);
		
	}

}
