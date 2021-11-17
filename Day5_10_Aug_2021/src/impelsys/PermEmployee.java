package impelsys;

public class PermEmployee extends Employee
{
    int nol;
    int noOfHolidays=10;
    
    
    {
    	noOfHolidays=10;
    	System.out.println("PERMEmployee object about to create");
    	
    }
	PermEmployee()
	{
		super();
		
		System.out.println("Child class Defualt cons invoked");
	}
	PermEmployee(int empno,String name, int nol)
	{
		super(empno,name);
		this.nol=nol;
		System.out.println("Child class par cons invoked");
		
	}
	public String toString()
	{
		String msg1=super.toString();
		String msg=msg1+String.valueOf(" No of Leaves:"+this.nol);		
		return msg;
		//return this.empno()+":"+this.ename()+":"+this.nol;
	}
}

//class A
//{
//	private int x;
//	protected int y;
//	int z=100;
//	public int w;
//	public int getX()
//	{
//		return this.x;
//	}
//}
//class B extends A
//{
//	private int aa;
//	
//}
//
//class C
//{
//	public void show()
//	{
//		B b=new B();
//		System.out.println(b.z);
//		b.g
//	}
	
	
//}