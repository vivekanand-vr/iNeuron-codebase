package com.getitdone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getitdone.model.Student;
import com.getitdone.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	public String save(Student student) {
		Student result = repo.save(student);
		return "student saved with value"+result.getId();
		
	}

}
