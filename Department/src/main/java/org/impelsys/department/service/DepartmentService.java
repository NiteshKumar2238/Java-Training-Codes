package org.impelsys.department.service;

import java.util.Optional;

import org.impelsys.department.model.Department;
import org.impelsys.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository deptRepo;
	
	public Department saveDepartment( Department dept) {
		return deptRepo.save(dept);
		
	}

	public Optional<Department> findDepartmentById(Integer id) {
		// TODO Auto-generated method stub
		return deptRepo.findById(id);
	}
	

}
