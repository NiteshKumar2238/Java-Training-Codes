package org.impelsys.employee.controller;

import java.util.Optional;

//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.impelsys.employee.model.Employee;
import org.impelsys.employee.service.EmployeeService;
import org.impelsys.employee.vo.ResponseVO;
//import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employees")
@Slf4j //generate a logger instance with default name log
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;

	//Logger log=LoggerFactory.
	
	//@PostMapping(value="/",consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	@PostMapping(value="/")
	public Employee saveEmployee(@RequestBody Employee emp) {
		//log.info("Inside saveDepartment");
		System.out.println("Inside saveEmployee");
		return empService.saveEmployee(emp);	
		
		
	}
	
//	@GetMapping("/{id}")
//	public Employee getEmployee(@PathVariable("id")Integer id) {
//		//log.info("Fetching department for id: "+id);
//		return empService.findEmployeeById(id);
//		
//		
//	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id")Integer id) {
		//log.info("Fetching department for id: "+id);
		return empService.findEmployeeById2(id);
		
		
	}
	
	@GetMapping("/employeeWithDept/{id}")
	public ResponseVO getEmployeeWithDept(@PathVariable("id")Integer id) {
		//log.info("Fetching department for id: "+id);
		return empService.findEmployeeWithDeptById(id);
		//Optional<Employee> e=empService.findEmployeeById2(id);
		
	
		
	}
	
	@GetMapping("/employee/version")
	public String getVersionInfo() {
		return "Employee Service- V2.0";
	}
}
