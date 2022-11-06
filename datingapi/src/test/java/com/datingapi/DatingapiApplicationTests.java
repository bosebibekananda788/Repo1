package com.datingapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.datingapi.controllers.UserAccountController;
import com.datingapi.entities.Students;
import com.datingapi.entities.UserAccount;
import com.datingapi.repos.InterestRepository;
import com.datingapi.repos.StudentsRepository;
import com.datingapi.repos.UserAccountRepository;

@SpringBootTest
class DatingapiApplicationTests {

    @Autowired
	StudentsRepository student;
	@Test
	public void testStudentCreate()
	{
		Students s1=new Students();
		s1.setFirstName("Bibek");
		s1.setLastName("Bose");
		s1.setScore(100);
	
		
		
		Students s2=new Students();
		s2.setFirstName("Bibekananda");
		s2.setLastName("Bose");
		s2.setScore(90);
		
		student.save(s1);
		student.save(s2);
		
	}
	
	@Test
	public void testgetAllStudent()
	{
		System.out.println(student.getAllStudent());
		
	}
	
	@Test
	public void testAllStudentPartials()
	{
		List<Object[]> partial=student.findAllStudentsPartialData();
		for(Object[]objects :partial)
		{
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
		
	}
	
	
	
	
}
