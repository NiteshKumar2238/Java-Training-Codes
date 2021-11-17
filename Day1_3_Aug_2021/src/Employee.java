import java.util.Scanner;

class Employee{
	int empno;
	String name;
	public void getData(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter empno");
		empno=Integer.parseInt(s.nextLine());
		System.out.println("enter name");
		name=s.nextLine();
		s.close();
	}
	
	public void show(){
		System.out.println("Name:"+name+"\t Empno"+empno);
	}
}