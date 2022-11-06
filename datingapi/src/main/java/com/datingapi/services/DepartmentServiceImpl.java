package com.datingapi.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datingapi.entities.Department;
import com.datingapi.error.DepartmentNotFoundException;
import com.datingapi.repos.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		
		
		return departmentRepository.save(department);
		
		
		
	}
	@Override
	public List<Department> fetchDepartmentList() {
	
		return departmentRepository.findAll();
	}
	@Override
	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
		
		Optional <Department>  department=departmentRepository.findById(departmentId);
		
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department not avilable");
		}
		return department.get();
		
	}
	@Override
	public void deleteByDepartmentById(Long departmentId) {
	
		departmentRepository.deleteById(departmentId);
		
	}
	@Override
	public Department updateDepartmentById(Long departmentId,Department department) {

		
		Department depDb=departmentRepository.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName()))
				{
					depDb.setDepartmentName(department.getDepartmentName());
				}
		
		
		
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode()))
		{
			depDb.setDepartmentCode(department.getDepartmentCode());
		}

		
		
		
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress()))
		{
			depDb.setDepartmentCode(department.getDepartmentAddress());
		}

		return departmentRepository.save(depDb);
		
	}
	@Override
	public Department fetchDepartmentByName(String name) {
		
		//return departmentRepository.findByDepartmentName(name);
		return departmentRepository.findByDepartmentNameIgnoreCase(name);
		
	}

}
