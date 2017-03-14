/*(4 points) Write a method to calculate the area of a triangle given the 
triangle's vertices (as points in the plane). The method should accept as 
input the three points, (x 1 , y 1 ), (x 2 ,y 2 ), and (x 3 , y 3 ), and 
calculate the area of the triangle using Heron's formula:
*/
package Final;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) 
    {
        DecimalFormat twoDecimal = new DecimalFormat("#,###.##");
        
        
        Scanner readInput = new Scanner(System.in);
        System.out.print("Type values of (x1, y1), (x2, y2), (x3, y3): ");
        // TWO sets of points are enough for this problem
        double x1 = readInput.nextDouble();
        double y1 = readInput.nextDouble();
        double x2 = readInput.nextDouble();
        double y2 = readInput.nextDouble();
        double x3 = readInput.nextDouble();
        double y3 = readInput.nextDouble();
        double a, b, c;
        a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c) );
        
        System.out.println("A = " + twoDecimal.format(A));
        
    }
    
}
