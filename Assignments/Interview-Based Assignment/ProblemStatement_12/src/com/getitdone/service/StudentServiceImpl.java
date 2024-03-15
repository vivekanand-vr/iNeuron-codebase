package com.getitdone.service;

import com.getitdone.model.Student;
import com.getitdone.persistance.IStudentRepository;
import com.getitdone.persistance.StudentRepoImpl;

public class StudentServiceImpl implements IStudentService {
	
	
	IStudentRepository repo=new StudentRepoImpl();

	@Override
	public String save(Student student) {
		
		return repo.save(student);
	}

	@Override
	public Student getById(Integer id) {
		
		return repo.getById(id);
	}

	@Override
	public Student update(Student student) {
		
		return repo.update(student);
	}

	@Override
	public String deleteById(Integer id) {
	
		return repo.deleteById(id);
	}

}
