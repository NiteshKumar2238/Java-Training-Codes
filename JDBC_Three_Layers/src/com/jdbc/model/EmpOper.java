package com.jdbc.model;

import com.jdbc.dao.EmpDAO;

public class EmpOper
{
	
	public static boolean addEmployee(Emp obj)
	{
		if(obj.getSal()>10000 && obj.getSal()<50000)
		{
			
		}
		
		if(obj.getDeptno()==10 || obj.getDeptno()==20 || obj.getDeptno()==30 || obj.getDeptno()==40)
		{
			
		}
		
		if(EmpDAO.addEmployee(obj))
			return true;
		else
			return false;
	}

}
