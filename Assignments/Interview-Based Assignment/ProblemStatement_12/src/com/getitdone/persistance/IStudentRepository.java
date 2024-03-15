package com.getitdone.persistance;

import com.getitdone.model.Student;

public interface IStudentRepository {

	public String save(Student student);
	public Student getById(Integer id);
	public Student update(Student student);
	public String deleteById(Integer id);
}
