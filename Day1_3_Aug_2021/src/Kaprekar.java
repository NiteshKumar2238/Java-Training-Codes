
import java.util.Scanner;

public class Kaprekar {

  public static boolean isKaprekar(int number) {

     
     int square = 0;
     int temp = 0;
     int countDigits = 0;
     int firstPart = 0;
     int secondPart = 0;
     int sum = 0;

     
     square = number * number;

     
     temp =square;
     while(temp!=0) {
        countDigits++;
        temp /= 10; 
     }

 
     for(int i=countDigits-1; i>0; i--) {

        
        firstPart = square / (int)Math.pow(10, i);
        secondPart = square % (int)Math.pow(10, i);


        if(firstPart == 0 || secondPart == 0)
        continue;

        
        sum = firstPart + secondPart;

        
        if( sum == number )
        return true;
     }
     return false;
  }

  public static void main(String[] args) {

     int minRange = 0, maxRange = 0;

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter min value of range:: ");
     minRange = scan.nextInt();
  
     System.out.print("Enter max value of range:: ");
     maxRange = scan.nextInt();

     System.out.println("The kaprekar numbers from "+
          minRange+" to "+ maxRange+" are:: ");

     for(int i=minRange; i<=maxRange; i++) {
        if(isKaprekar(i))
	   System.out.print(i+" ");
     }

     scan.close();
  }
}