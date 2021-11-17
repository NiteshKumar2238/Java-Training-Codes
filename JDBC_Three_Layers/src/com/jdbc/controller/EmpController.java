package com.jdbc.controller;

import com.jdbc.model.EmpOper;
import com.jdbc.model.Emp;

public class EmpController 
{
	public static void addEmployee()
	{
		
	}
	
	public static boolean getAllEmployees(int eno,String nam,String job,float sal,int dno)
	{
		Emp e=new Emp(eno,nam,job,sal,dno);
		
		if(EmpOper.addEmployee(e))
			return true;
		return false;
	}
}
