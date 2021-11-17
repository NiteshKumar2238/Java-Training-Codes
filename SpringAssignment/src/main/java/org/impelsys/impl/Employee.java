package org.impelsys.impl;

import org.impelsys.model.Shift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	private int empID;
	
	//@Autowired
	@Value("Nitesh")
	private String empName;
	Shift shift;
	
	public Employee(){
		System.out.println("Employee default constructor");
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	

	public String getEmpName() {
		return empName;
	}
	
	//@Autowired
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Shift getShift() {
		return shift;
	}
	
	public void setShift(Shift shift) {
		this.shift = shift;
	}
	
	
}
