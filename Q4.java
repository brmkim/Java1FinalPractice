/*(2 points) Write a method to calculate the distance between two points in the
plane. The method should accept two points, (x 1 , y 1 ), and (x 2 , y 2 ), 
and it calculate the distance between (2-decimal places)them using the distance 
formula d= Math.sqrt( Math.pow(x1-x2), 2) + Math.pow(y1-y2), pow);
 */
package Final;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) 
    {
        DecimalFormat twoDecimal = new DecimalFormat("#,###.##");
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the values for (x1, y1) and (x2, y2)");
       double x1 = input.nextDouble();
       double y1 = input.nextDouble();
       double x2 = input.nextDouble();
       double y2 = input.nextDouble();
       
       System.out.println("The distance between two points are: " + twoDecimal.format(distance(x1, y1, x2, y2)));
       
    }
    
    private static double distance (double x1, double y1, double x2, double y2)
    {
        return Math.sqrt( Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
    }
}
