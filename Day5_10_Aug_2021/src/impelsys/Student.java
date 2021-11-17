package impelsys;

public class Student 
{
	
	private int roll;
	private String name;
	private float marks;
	@Override
	public String toString() {
		return "Student roll=" + roll + ", name=" + name + ", marks=" + marks ;
	}
	public Student(int roll, String name, float marks) {
		//super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}

}