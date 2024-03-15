package com.getitdone.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getRequestURI().endsWith("/Welcome")) {
			HttpSession session = request.getSession();
			session.setAttribute("name", request.getParameter("name"));
			session.setAttribute("address", request.getParameter("address"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("./WEB-INF/views/show.jsp");
			dispatcher.forward(request, response);
			
		}
	}

}
