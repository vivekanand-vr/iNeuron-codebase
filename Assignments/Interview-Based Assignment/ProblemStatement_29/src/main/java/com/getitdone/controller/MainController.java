package com.getitdone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getitdone.model.Student;
import com.getitdone.service.StudentService;

@RestController
@RequestMapping("/api/test")
public class MainController {
	@Autowired
	private StudentService service;
	@GetMapping("/get/{pageNo}/{size}")
	public ResponseEntity<List<Student>> getStudents(@PathVariable Integer pageNo,@PathVariable Integer size){
		
		   Iterable<Student> students = service.getStudents(pageNo, size);
		
		return new ResponseEntity<List<Student>>((List<Student>) students,HttpStatus.OK);
	}

}
