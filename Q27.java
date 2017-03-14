/*
 Write a method that accepts a two-dimensional array of integers and returns 
the sum of all the elements in the array.
 */
package Final;

import java.util.Scanner;

public class Q27 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter int numbers for 2 x 5 matrix: ");
        int[][] matrix = new int [2][5];
        for (int r = 0; r < 2; r++)
        {
            for (int c = 0; c < 5; c++)
                matrix[r][c] = input.nextInt();
        }
        System.out.println("Two-dimensional array entered: ");
        printMatrix(matrix);
        System.out.print("Sum of the elements: ");
        System.out.println(sum(matrix));
    }
    public static void printMatrix(int[][] matrix)
    {
            for (int c = 0; c < 5; c++)
                System.out.print(matrix[0][c] + " ");
            System.out.println();
            for (int c = 0; c < 5; c++)
                System.out.print(matrix[1][c] + " ");
            System.out.println();
    }
    public static int sum(int[][] matrix)
    {
        int sum = 0;
        for (int r = 0; r < 2; r++)
        {
            for (int c = 0; c < 5; c++)
                sum += matrix[r][c];
        }
            
        return sum;
        
    }
}
