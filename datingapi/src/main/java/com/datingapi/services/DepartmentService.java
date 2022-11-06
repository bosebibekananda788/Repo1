package com.datingapi.services;

import java.util.List;

import com.datingapi.entities.Department;
import com.datingapi.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteByDepartmentById(Long departmentId);

	public Department updateDepartmentById(Long departmentId,Department department);

	public Department fetchDepartmentByName(String name);

}
