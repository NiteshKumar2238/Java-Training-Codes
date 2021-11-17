import java.util.ArrayList;
import java.util.Scanner;

public class Program1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		Employee e1;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter empno:");
			int eno=Integer.parseInt(scan.nextLine());
			System.out.println("Enter ename:");
			String nm=scan.nextLine();
			e1=new Employee();e1.setEmpno(eno);e1.setName(nm);
			arr.add(e1);
		}
		
		for(Object obj:arr)
		{
			Employee tempObj=(Employee)obj;
			System.out.println(tempObj.toString());
		}
		
		System.out.println("Enter the empno whose name to be updated:");
		int no=Integer.parseInt(scan.nextLine());
		boolean flag=false;
		for(Object obj:arr)
		{
			Employee tempObj=(Employee)obj;
			if(tempObj.getEmpno()==no)
			{
				System.out.println("Found:Please eneter the name:");
				String n=scan.nextLine();
				tempObj.setName(n);
				flag=true;				
			}		
		}
		if(flag==true)
			System.out.println("Updated succ");
		else
			System.out.println("Not found. ");	
		
		for(Object obj:arr)
		{
			Employee tempObj=(Employee)obj;
			System.out.println(tempObj.toString());
		}
		
	}
	

}