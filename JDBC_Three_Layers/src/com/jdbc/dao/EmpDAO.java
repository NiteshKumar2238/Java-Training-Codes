package com.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.model.Emp;

public class EmpDAO 
{
	public static boolean addEmployee(Emp obj){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");
			String sql="insert into emp(empno,ename,job,sal,deptno) values (?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, obj.getEmpno());
			stmt.setString(2, obj.getEname());
			stmt.setString(3,obj.getJob());
			stmt.setFloat(4,obj.getSal());
			stmt.setInt(5, obj.getDeptno());
			int nor=stmt.executeUpdate();
			con.close();
			if(nor>0)
				return true;
			else
				return false;
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public static ArrayList<Emp> showAllEmployees()
	{
		List<Emp> l=new ArrayList<>();
		try
		{
			
		}
		
		catch()
		{
			
		}
	}
}
