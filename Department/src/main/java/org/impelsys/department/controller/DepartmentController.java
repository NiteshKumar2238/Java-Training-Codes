package org.impelsys.department.controller;

import java.util.Optional;

import org.impelsys.department.model.Department;
import org.impelsys.department.service.DepartmentService;

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
@RequestMapping("/department")
@Slf4j //generate a logger instance with default name log

public class DepartmentController {
	@Autowired
	DepartmentService deptService;
	
	@PostMapping(value="/") //, consumes=MediaType.APPLICATION_JSON, produces=MediaType.APPLICATION_JSON
	public Department saveDepartment(@RequestBody Department dept) {
		//log.info("Inside save Department");
		System.out.println("In saveDepartment()");
		return deptService.saveDepartment(dept);
	}
	
	@GetMapping("/{id}")
	public Optional<Department> getDepartment(@PathVariable("id") Integer id) {
		//log.info("Fetching department for id: ");
		System.out.println("In getDepartment()");
		return deptService.findDepartmentById(id);
	}
	
}