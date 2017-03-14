/*(4 points) Write a method to approximate the value of π. Use the following 
 formula for the approximation:
 π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)

The method should accept as input an integer n which represets the number of 
terms in the series and output the approximate value of π to within 4 decimal 
places. Fo example if n = 3, the method should return
4 * (1 - 1/3 + 1/5) = 2.7227136331111541400009575988422 ≈ 2.7227.
 */
package Final;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int value to approximate the value of Pi: ");
        int n = input.nextInt();
        System.out.println(piVal(n));
        
    }
    private static double piVal(int n)
    {
        
        double val = 0;
        
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
                val -= (double) 1 / (2 * i - 1);
            else
                val += (double) 1 / (2 * i - 1);
        }

        return 4 * val;

    }
        
    }
   
