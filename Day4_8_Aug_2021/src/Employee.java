public class Employee 
{

	private int empno;  // readonly ,getter
	private String ename; // readonly , getter
	private String dept; // read & write , getter & setter
	private float sal;// read & write , getter and setter
	
	static int noe=0;
	
	Employee(int empno,String ename,String dept)
	{
		this.empno=empno;this.ename=ename;this.dept=dept;
		this.sal=25000;
		
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