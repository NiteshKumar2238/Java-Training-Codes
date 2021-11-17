import java.util.Scanner;


public class Pgm1 
{
static Scanner scan;
static Employee arr[];
static int pos=0;
public static void main(String arg[])
{  
	
	scan=new Scanner(System.in);
	arr=new Employee[100];	
	while(true)
	{
		System.out.println("1.Add Employee");		
		System.out.println("2.update Salary by empno");
		System.out.println("3.Show by empno");
		System.out.println("4.show by emp dept");
		System.out.println("5.Display All");
		System.out.println("0.");
		
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
public static void addEmployee()
{
	System.out.println("Enter empno:");
	int en=Integer.parseInt(scan.nextLine());
	System.out.println("Enter name");
	String nm=scan.nextLine();
	System.out.println("Enter dept name");
	String dp=scan.nextLine();
	
	boolean flag=false;
	for(int i=0;i<pos;i++)
	{
		if(arr[i].empno()==en)
		{
			flag=true;
			break;
		}
	}
	
	
	if(flag==false)
	{
	Employee e1=new Employee(en,nm,dp);
	arr[pos]=e1;
	System.out.println("Added success");
	pos++;
	}
	else
	  System.out.println("Duplicate empno.Not allowed");
		
	
}
public static void updateSalbyEmpno()
{
	System.out.println("Enter empno:");
	int en=Integer.parseInt(scan.nextLine());
	System.out.println("Enter the salery amount");
	int sal=Integer.parseInt(scan.nextLine());
	boolean flag=false;
	for(int i=0;i<pos;i++)
	{
		if(arr[i].empno()==en)
		{
			arr[i].sal(sal);
			
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
public static void showByEmpno()
{
	System.out.println("Enter eno");
	int en=Integer.parseInt(scan.nextLine());
	for(int i=0;i<pos;i++)
	{
		if(arr[i].empno()==en)
			System.out.println("Emp name="+arr[i].ename());	
	}
	
}
public static void showByDept()
{
	System.out.println("Enter dept");
	String dp=scan.nextLine();
	for(int i=0;i<pos;i++)
	{
		if(arr[i].dept().equalsIgnoreCase(dp))
			System.out.println("Emp name="+arr[i].ename());	
	}
}
public static void showAll()
{
	for(int i=0;i<pos;i++)
	{
		System.out.println(arr[i].empno()+":"+arr[i].ename()+":"+arr[i].sal()+":"+arr[i].dept());
	}
}
}