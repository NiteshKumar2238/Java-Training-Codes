import java.sql.*;
import java.util.Scanner;

public class EmployeeMenuDriven {
	static Scanner scan;
	static int eno,sl;
	static String nm;

	public static void main(String args[]){
		
		try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");
	PreparedStatement ps1;
//	int eno,sl;
//	String nm;
	while(true){
		System.out.println("1.Add Employee");		
		System.out.println("2.update Salary by empno");
		System.out.println("3.Show by empno");
		System.out.println("4.show by emp dept");
		System.out.println("5.Display All");
		System.out.println("0.Exit");
		
		System.out.println("Enter your choice:");
		int ch= Integer.parseInt(scan.nextLine());
		switch(ch)
		{
		case 1: addEmployee(); 
				break;
		case 2: updateSalbyEmpno();
				break;
		case 3: showByEmpno();
				break;
		case 4: showByDept();
				break;
		case 5: showAll();
				break;
		case 0:	System.exit(0);
				break;
		default:System.out.println("Enter the right choice");
	}
	
		}
		}
	
	catch(Exception e){
		e.printStackTrace();
	}
		
		
}
	
	public static void addEmployee(){
		while(true)
		{
		System.out.println("Enter New Empno:");
		Scanner scan=new Scanner(System.in);
		eno=Integer.parseInt(scan.nextLine());
		System.out.println("Enter New Emp name:");
		nm=scan.nextLine();
		System.out.println("Enter salary:");
		sl=Integer.parseInt(scan.nextLine());
		String sql="select empno as nor from emp where empno=?";// 7788
		ps1=con.prepareStatement(sql);
		ps1.setInt(1,eno);
		ResultSet rs=ps1.executeQuery();
		boolean rf=false;		
		while(rs.next())
		{
			rf=true;
		}
		if(rf==true)
		{
			System.out.println("Empno is already existing.Please enter new.");
			continue;
			}
		else
			break;			
		}				
		ps1=con.prepareStatement("insert into emp(empno,ename,sal) values(?,?,?)");
		ps1.setInt(1, eno);
		ps1.setString(2, nm);
		ps1.setInt(3, sl);
		ps1=con.prepareStatement("insert into emp(empno,ename,sal,deptno) values(?,?,?,?)");
		
		int nor=ps1.executeUpdate();
		
		
		System.out.println(nor + " Record Addedd Succ");		
		
	}

}
