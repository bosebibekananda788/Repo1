package com.datingapi.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.datingapi.entities.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

	@Query("from Students")
	List<Students> getAllStudent();
	
	@Query("select firstName,lastName from Students s")
	List<Object[]>findAllStudentsPartialData();
	
	
}
