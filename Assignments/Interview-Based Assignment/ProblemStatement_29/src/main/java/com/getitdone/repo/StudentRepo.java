package com.getitdone.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.getitdone.model.Student;

public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {

	
}
