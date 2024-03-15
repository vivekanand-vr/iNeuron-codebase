package com.getitdone.service;

import com.getitdone.model.Student;

public interface StudentService {

  
 
 public Iterable<Student> getStudents(Integer pageNo, Integer size);
}
