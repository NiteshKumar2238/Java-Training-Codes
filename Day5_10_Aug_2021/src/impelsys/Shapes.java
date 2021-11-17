package impelsys;

public class Shapes
{
	public static void main(String [] args)
	{
//		Square sq=new Square(5);
//		sq.area();
//		sq.perimiter();
//		Rectangle r=new Rectangle(2,3);
//		r.area();
//		r.perimiter();
		//Rectangle r=new Rectangle ();
		Shape s;
		s=new Square(4);
		s.area();// .... sq
		s=new Rectangle(4,5);
		s.area();// .... rec
		
		
	}

}
abstract class Quadilateral implements Shape
{
	float a,b,c,d;
	
	public void perimiter()
	{
		float res=a+b+c+d;
		System.out.println("Per:"+res);
	}
	
}
class Rectangle extends Quadilateral
{
	Rectangle(int a, int b)
	{
		this.a=this.c=a;
		this.b=this.d=b;
	}
	public void area()
	{
		float ar=a*b;
		System.out.println("Rec: Area="+ar);
	}
	
}
class Square extends Rectangle
{
	Square(int a)
	{
		super(a,a);
		//this.a=this.b=this.c=this.d=a;
	}
	public void area()
	{
		float ar=a*a;
		System.out.println("Sq: Area="+ar);
	}
}

interface Shape
{
	public void perimiter();
	public void area();
	
}