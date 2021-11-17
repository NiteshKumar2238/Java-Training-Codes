/*import java.util.ArrayList;

public class ArrayList1
{
public static void main(String args[])
{
	ArrayList arr;
	arr=new ArrayList();
//	System.out.println("size:"+arr.size());
//	arr.add(123);
//	arr.add(456);
//	arr.add("JAVA");
//	arr.add(new String("abc"));
//	arr.add(45.56f);	
//	arr.add(new Integer(456));
	Employee e1=new Employee();
	e1.setEmpno(1001);e1.setName("Jack");
	arr.add(e1);
	
	
	e1=new Employee(); e1.setEmpno(1002);e1.setName("Brown");
	arr.add(e1);
	
	e1=new Employee(); e1.setEmpno(1003);e1.setName("Pritam");
	arr.add(e1);
	
	
	e1=new Employee(); e1.setEmpno(1004);e1.setName("Yash");
	arr.add(e1);
	
	e1=new Employee(); e1.setEmpno(1005);e1.setName("Rohit");
	
	arr.add(2, e1 );
	
	
	
	arr.remove(1);
	
	
	Employee e5=new Employee(); e1.setEmpno(1005);e1.setName("Rohit");
	if(arr.remove(e5))
		System.out.println("RExistign and removed");
	else
		System.out.println("Not existing");
	
	for( Object obj : arr)
	{		
		Employee temp=(Employee)obj;
		System.out.println(temp.toString());
	}
	
	System.out.println("No of Lements in arraylist:"+arr.size());
//	Integer o=(Integer)arr.get(0);
//	System.out.println(o.toString());
//	
//	String str=(String)arr.get(1);
//	System.out.println(str.toString());
//	Employee temp=(Employee)arr.get(5);
//	System.out.println(temp.toString());
	
	for( Object obj : arr)
	{		
		Employee temp=(Employee)obj;
		//System.out.println(temp.toString());
//		if(obj instanceof Integer)
//		{
//		Integer intObj=(Integer)obj;
//		int z=(int)intObj+1000;
//		System.out.println(obj.toString());
//		}
//		else if(obj instanceof String)
//		{
//			System.out.println("String:"+obj.toString());
//		}
//		//int zz=Integer.parseInt(intObj.toString())+1000;
//		else if(obj instanceof Employee)
//		{
//		System.out.println("Employee data:");
//		System.out.println("***********************************");
//		System.out.println(obj.toString());
//		}
	
	}
	
}
}


class Employee
{
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int empno;
	String name;
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + "]";
	}
	
	
}
*/