import java.util.ArrayList;
import java.util.List;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> arr;
//		arr=new ArrayList<Integer>();
//		
//		arr.add(123);
//		arr.add(new Integer(123));
//		arr.add(123);
//		for(Integer obj:arr)
//			System.out.println(obj.toString());
//		
		List<Employee> arr;
		arr=new ArrayList<Employee>();
		Employee e1=new Employee();
		arr.add(e1);
		PerEmployee e2=new PerEmployee();
		arr.add(e2);
		Employee ee;
		PerEmployeeProduct pr=new PerEmployeeProduct();
		ee=e2.shiftDept(pr);
		arr.add(ee);
		
	}

}

class Employee{
	
}

class PerEmployee extends Employee{
	
	
}

class PerEmployeeProduct extends PerEmployee{
	
}