package com.datingapi.services;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.datingapi.entities.Department;
import com.datingapi.repos.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	@MockBean
	@Autowired
	private  DepartmentRepository departmentRepository;
	/*@BeforeEach
	static void setUpBeforeClass() throws Exception {
		
		Department department=Department.builder().departmentName("Mechanical").departmentAddress("Burla").departmentCode("CSE").departmentId(50L).build();
		
		//Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("Mechanical")).thenReturn(department);
	}
*/
	@Test
	void test() {
		fail("Not yet implemented");
	}


	public void whenValidDepartmentName_DepartmentNameShouldFound()
	{
		String departmentName="Mechanical";
		Department found=departmentService.fetchDepartmentByName(departmentName);
		assertEquals(departmentName,found.getDepartmentName());
		
	}
}
