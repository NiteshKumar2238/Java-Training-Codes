import java.sql.*;
public class Program {

	public static void main(String[] args)
	{
		
		 try
		 {
			Class.forName("com.mysql.jdbc.Driver");  
	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");  			
			Statement stmt=con.createStatement(); 			
			stmt.execute("insert into emp(empno,ename,sal) values(4567,'Tom',3000)");		  
		    System.out.println("Added");		    
	
			   con.close();  
		 }
		 catch(Exception e)
		 {
			 System.out.println("Not done");
			 e.printStackTrace();
		 }
		
	   
	}

}