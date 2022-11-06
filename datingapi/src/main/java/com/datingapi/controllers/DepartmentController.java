package com.datingapi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.datingapi.entities.Department;
import com.datingapi.error.DepartmentNotFoundException;
import com.datingapi.services.DepartmentService;
import com.datingapi.services.DepartmentServiceImpl;



@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	
	
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/department")
	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/department/{id}")
	
	public Department fetchDepartmentById(@PathVariable ("id") Long departmentId ) throws DepartmentNotFoundException
	{
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/department/DeleteBy/{id}")
	public String  deleteDepartmentById(@PathVariable ("id") Long departmentId)
	{
		
		departmentService.deleteByDepartmentById(departmentId);
		return "Department Deleted Suscesfully";
	}
	
	@PutMapping("/department/updateBy/{id}")
	
	public Department updateDepartmentById(@PathVariable ("id") Long departmentId, @RequestBody Department department)
	
	{
		return departmentService.updateDepartmentById(departmentId,department);
	}
	
	@GetMapping("/department/ByName/{name}")
	public Department fetchDepartmentByName(@PathVariable ("name") String name)
	{
		return departmentService.fetchDepartmentByName(name);
	}
	
	
}
