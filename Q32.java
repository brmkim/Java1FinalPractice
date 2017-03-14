/*
(Sum the major diagonal in a matrix) Write a method that sums all the numbers 
in the major diagonal in an n * n matrix of double values using the 
following header:
public static double sumMajorDiagonal(double[][] m)
Write a test program that reads a 4-by-4 matrix and displays the sum of all its
elements on the major diagonal.
 */
package Final;

public class Q32 {

    public static void main(String[] args) {
       double[][] testMatrix = {
           {1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15, 16} };
       System.out.println("Sum of the diagonal : " 
               + sumMajorDiagonal(testMatrix));
       
    }
    public static double sumMajorDiagonal(double[][] m)
    {
        double sum = 0;
        for (int r = 0; r < m.length; r++)
            sum += m[r][r];

        return sum;
    }
    
    
}
