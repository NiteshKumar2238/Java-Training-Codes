package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public class EmployeeDao {

	//boolean flag=false;
	public boolean addEmployee(Employee emp){
//		try{
//		Class.forName("com.mysql.jdbc.Driver"); 
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");
//		
//		String sql="insert into Employee(name,salary,designation) values('"+e.getName()+"',"+e.getSalary()+",'"+e.getDesignation()+"')";
//		PreparedStatement stmt=con.prepareStatement(sql);
//		stmt.setString(1, e.getName());
//		stmt.setFloat(1,e.getSalary());
//		stmt.setString(1, e.getDesignation());
//		//return (Integer) null;
//	}
//		catch(Exception a){
//			System.out.println(a);
//		}
		
	System.out.println("Adding employee (in dao)");
	boolean flag=true;
	System.out.println(emp.getName()+" "+emp.getDesignation());
		
	return flag;
	}
	
}
