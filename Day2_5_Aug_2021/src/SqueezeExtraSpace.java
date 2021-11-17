import java.util.Scanner;
public class SqueezeExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence=s.nextLine();
		String newstr=sentence.replaceAll(" ","");
		System.out.println(newstr);
		s.close();
	}
	                  
	
}
