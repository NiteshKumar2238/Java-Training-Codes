public class Employee {
	 int empno;  // readonly ,getter
	 String ename; // readonly , getter
	 String dept; // read & write , getter & setter
	 float sal;// read & write , getter and setter
	
	static int noe=0;
	
	Employee(int empno,String ename,float sal,String dept)
	{
		this.empno=empno;this.ename=ename;this.dept=dept;
		this.sal=sal;
		
	}
	


	public int empno()
	{
		return this.empno;
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