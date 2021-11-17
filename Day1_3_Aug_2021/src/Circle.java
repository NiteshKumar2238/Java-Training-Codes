
public class Circle {

	public static void main(String[] args) {
	
		int radius[]={23,34,45};
		int perimeter[];
		perimeter=getPerimeter(radius);
		
		for(int i=0;i<radius.length;i++){
			System.out.println(perimeter[i]);
		}
		
		
		

	}
	
	public static int[] getPerimeter(int[] radius){
		int result[]=new int[radius.length];
		for(int i=0;i<radius.length;i++){
			result[i]=(int)((double)2*3.14*(double)radius[i]);
		}
		return result;
		
	}

}
