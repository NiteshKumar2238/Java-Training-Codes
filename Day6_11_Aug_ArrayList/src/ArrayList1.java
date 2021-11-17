

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList1 {
	static Scanner scan;
	//static Employee arr[];
	

	static int pos=0;
	public static void main(String[] arg)
	{  
		ArrayList<Employee> arr = new ArrayList<Employee>();
		
		scan=new Scanner(System.in);
//		arr=new Employee[100];	
		
		
		while(true)
		{
			System.out.println("1.Add Employee");		
			System.out.println("2.Update Salary by empno");
			System.out.println("3.Show by empno");
			System.out.println("4.Show by emp dept");
			System.out.println("5.Display All");
			System.out.println("6.Delete Employee by Empno");
			System.out.println("0.");
			
			System.out.println("Enter your choice:");
			int ch= Integer.parseInt(scan.nextLine());
			switch(ch)
			{
			case 1: addEmployee(arr); 
					break;
			case 2: updateSalbyEmpno(arr);
					break;
			case 3: showByEmpno(arr);
					break;
			case 4: showByDept(arr);
					break;
			case 5: showAll(arr);
					break;
			case 6: deleteByEmpno(arr);
					break;		
			case 0:	System.exit(0);
					break;
			default:System.out.println("Enter the right choice");
			
			}
		}
	}
	public static void addEmployee( ArrayList<Employee> arr )
	{
		System.out.println("Enter empno:");
		int en=Integer.parseInt(scan.nextLine());
		System.out.println("Enter name");
		String nm=scan.nextLine();
		System.out.println("Enter the salery amount");
		float saly=Float.parseFloat(scan.nextLine());
		System.out.println("Enter dept name");
		String dp=scan.nextLine();
		
		
		boolean flag=false;
		for(int i=0;i<pos;i++)
		{
			if(arr.get(i).empno()==en)
			{
				flag=true;
				break;
			}
		}
		
		
		if(flag==false)
		{
			
//		Employee e1=new Employee(en,nm,dp);
//		arr[pos]=e1;
			
		Employee e1=new Employee(en,nm,saly,dp);
		arr.add(e1);
		System.out.println("Added success");
		pos++;
		}
		else
		  System.out.println("Duplicate empno.Not allowed");
			
		
	}
	public static void updateSalbyEmpno(ArrayList<Employee> arr)
	{
		System.out.println("Enter empno:");
		int en=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the salery amount");
		float sal=Float.parseFloat(scan.nextLine());
		boolean flag=false;
		for(int i=0;i<pos;i++)
		{
			if(arr.get(i).empno()==en)
			{
				arr.get(i).sal(sal);
				
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Updated");
		}
		else
			System.out.println("Employee id not found");
					
	}
	public static void showByEmpno(ArrayList<Employee> arr)
	{
		System.out.println("Enter eno");
		int en=Integer.parseInt(scan.nextLine());
		for(int i=0;i<pos;i++)
		{
			if(arr.get(i).empno()==en)
				System.out.println("Emp name="+arr.get(i).ename());	
		}
		
	}
	public static void deleteByEmpno(ArrayList<Employee> arr)
	{
		System.out.println("Enter eno");
		int en=Integer.parseInt(scan.nextLine());
		boolean flag = false;
		for(int i=0;i<pos;i++)
		{
			if(arr.get(i).empno()==en)
			{
				arr.remove(i);
				pos--;
				System.out.println("Emp Deleted");	
				flag = true;
					break;	
			}
		
		}
		if(flag!=true) {
			System.out.println("Emplyee not found");
		}
			
		
	}
	public static void showByDept(ArrayList<Employee> arr)
	{
		System.out.println("Enter dept");
		String dp=scan.nextLine();
		for(int i=0;i<pos;i++)
		{
			if(arr.get(i).dept().equalsIgnoreCase(dp))
				System.out.println("Emp name="+arr.get(i).ename());	
		}
	}
	public static void showAll(ArrayList<Employee> arr)
	{
		if(pos==0)
			System.out.println("No Employee recorded");
		else
			
		for(int i=0;i<pos;i++)
		{
			System.out.println(arr.get(i).empno()+":"+arr.get(i).ename()+":"+arr.get(i).sal()+":"+arr.get(i).dept());
		}
	}
}
