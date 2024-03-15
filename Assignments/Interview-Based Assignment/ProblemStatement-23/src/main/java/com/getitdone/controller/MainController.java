package com.getitdone.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.getitdone.model.Student;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/registerandlogin")
public class MainController {
	private HttpSession session;
	private String uname;
	private String upass;
	@GetMapping("/")
	public String showHome() {
		System.out.println("MainController.showHome()");
		return"index";
	}
	@GetMapping("/authenticate")
	public String authenticate(Map<String,Object > map,@RequestParam("username") String username,@RequestParam("password")String password,HttpServletRequest request) {
		session=request.getSession();
		System.out.println(session.getAttribute("uname"));
		System.out.println(session.getAttribute("upass"));
		if(((String) session.getAttribute("uname")).equalsIgnoreCase(username)&&((String)session.getAttribute("upass")).equalsIgnoreCase(password)) {
			map.put("result", "success");
		}else {
			map.put("result", "failed");
			
		}
		
		
		return"login-result";
	}
	@GetMapping("/registerPage")
	public String registerPage() {
		return"register";
	}
	@PostMapping("/register")
	public String register(Map<String,Object> map,@ModelAttribute("std")Student student,HttpServletRequest request) {
		session=request.getSession();
		uname=student.getUsername();
		session.setAttribute("uname",student.getUsername());
		upass=student.getPassword();
		session.setAttribute("upass", student.getPassword());
		map.put("result", "successfull");
		return"registration-result";
	}
	

}
