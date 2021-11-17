package model;

import java.util.Date;

import javax.validation.constraints.Min;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import customannotations.Year;
import validators.Severity;

@Component
public class Employee {
	
	
	int id; 
	
	@NotNull
	@Size(min=3,max=30,message="Employee name should be more than 3 characters and less than 30 characters")
	@Pattern(regexp="[^0-9]*")
	String name; 
	
	

	@NotNull(message="Salary cannot be empty")
	@Min(100)
	float salary;   
	
	@NotNull(message="Required")
	String designation;
	
	@Range(min=2,max=5,message="Experience should be between 2 to 5 years")
	int empExperience;
	
	@NotNull(message="DOB cannot be empty")
	@Past
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Year(value=2001,message="Please ensure year of birth  is 2001",payload=Severity.Error.class)
	Date dateOfBirth;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public int getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		System.out.println(dateOfBirth);
		this.dateOfBirth = dateOfBirth;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", empExperience=" + empExperience + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	}
