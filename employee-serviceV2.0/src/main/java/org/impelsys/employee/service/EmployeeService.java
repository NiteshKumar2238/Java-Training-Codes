package org.impelsys.employee.service;

import java.util.Optional;

//import org.impelsys.employee.model.Department;
import org.impelsys.employee.model.Employee;
import org.impelsys.employee.repository.EmployeeRepository;
import org.impelsys.employee.vo.Department;
import org.impelsys.employee.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EmployeeRepository empRepo;

	public Employee saveEmployee(Employee dept) {
		// TODO Auto-generated method stub
		return empRepo.save(dept);
		
	}

	public Employee findEmployeeById(Integer id) {
		return empRepo.getById(id);
	}
	
	public Optional<Employee> findEmployeeById2(Integer id) {
		return empRepo.findById(id);
	}
	
	public ResponseVO findEmployeeWithDeptById(Integer id){
		ResponseVO responseVO= new ResponseVO();
		Employee emp= empRepo.findById(id).get();
		//need to call different microservice department
		
		ResponseEntity<Department> deptResponse=restTemplate.getForEntity("http://localhost:9001/department/"+emp.getDeptId(),Department.class);
		System.out.println("deptResponse :" +deptResponse);
		//log.info("deptResponse :" +deptResponse);
		responseVO.setEmployee(emp);
		responseVO.setDepartment(deptResponse.getBody());
		
		return responseVO;
		
	}
}
