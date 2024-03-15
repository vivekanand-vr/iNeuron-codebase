package com.getitdone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getitdone.model.Student;
import com.getitdone.repo.StudentRepo;

@RestController
@RequestMapping("/api/test")
public class StudentController {
	@Autowired
	private StudentRepo repo;
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getStudent(@PathVariable Integer id){
		
		
		Student student = repo.getById(id);

		return new ResponseEntity<String>(student.toString(),HttpStatus.OK);
	}

}
