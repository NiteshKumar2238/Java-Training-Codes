import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr[];
		//arr=new int[6];
		//arr[0]=100;
		//arr[1]=100;
		//arr[2]=100;
		//arr[3]=100;
		//arr[4]=100;
		//for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
		//}
		
		Employee employees[]=new Employee[3];
		Employee e1;
		for(int i=0;i<3;i++){
			e1=new Employee();
			e1.getData();
			System.out.println(employees[i]);
		}
				
	}

}


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