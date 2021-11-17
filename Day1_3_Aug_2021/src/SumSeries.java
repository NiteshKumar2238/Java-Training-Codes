import java.util.Scanner;

public class SumSeries 

{

    public static void main(String[] args) 

    {

        double sum = 0;

        int n;

        System.out.println("1/2! + 3/4! + 5/6! + ...!");

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no. of terms in series:");

        n = s.nextInt();


        int j=2;
        int k=1;
        for(int i = 1; i <= n; i++)

        {
        	
            sum = sum + (double)k / fact(j);
            k+=2;
            j+=2;

        }

        System.out.println("Sum of series:"+sum);

    
    }
    
          static  int fact(int x)

        {

            int mul = 1;

            while(x > 0)

            {

                mul = mul * x;

                x--;

            }

            return mul;

        }

    }

