package com.getitdone.service;

import com.getitdone.model.Student;

public interface IStudentService {
	
	public String save(Student student);
	public Student getById(Integer id);
	public Student update(Student student);
	public String deleteById(Integer id);

}
