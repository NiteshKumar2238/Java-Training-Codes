package com.jdbc.view;

import java.util.Scanner;

import com.jdbc.controller.EmpController;

public class Program {
	
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.println("1.Add Employee");
			System.out.println("2.Show all Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Show by Employee no");
			System.out.println("6.Add Employee");
			int ch=Integer.parseInt(scan.nextLine());
			switch(ch){
			case 1:
				System.out.println("enter empno");
				int eno=Integer.parseInt(scan.nextLine());
				System.out.println("enter name");
				String nm=scan.nextLine();
				System.out.println("enter job");
				String job=scan.nextLine();
				System.out.println("enter sal");
				float sal=Float.parseFloat(scan.nextLine());
				System.out.println("enter deptno");
				int dept=Integer.parseInt(scan.nextLine());
				
				
				if(EmpController.addEmployee(eno,nm,job,sal,dept))
					System.out.println("added successfully");
				else
					System.out.println("not added");
					break;
			case 2:EmpController.getAllEmployees(); break;
			
			default:
				System.exit(0);
			}
		}
	}

}
