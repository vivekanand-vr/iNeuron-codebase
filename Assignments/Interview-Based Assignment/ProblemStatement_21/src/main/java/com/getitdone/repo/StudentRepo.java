package com.getitdone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getitdone.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
