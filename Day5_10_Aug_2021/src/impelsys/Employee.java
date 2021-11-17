package impelsys;

public class Employee 
{

	private int empno;  // readonly ,getter
	private String ename; // readonly , getter
	private String dept; // read & write , getter & setter
	private float sal; // read & write , getter and setter
	static int noe=0;
	
	static
	{
		System.out.println("Static inistilaizing the class");
		Employee.noe=100;
	}
	
	 {
	    	
	    	System.out.println("Employee object about to create");
	    	
	 }
	Employee(int empno,String ename)
	{
		this.empno=empno;this.ename=ename;
		System.out.println("Parent class par cons invoked");
	}
	Employee()
	{
		System.out.println("Parent class Defualt cons invoked");
	}
	public int empno()
	{
		return (this.empno+100000);
	}
	public String ename()
	{
		return this.ename;
	}
	public String dept()
	{
		return this.dept;
	}
	public void dept(String dept)
	{
		this.dept=dept;
	}
	public float sal()
	{
		return this.sal;
	}
	public void sal(float sal)
	{
		this.sal=sal;
	}	
	public String toString()
	{
		return "Empno:"+this.empno+" Name:"+this.ename;
	}
}