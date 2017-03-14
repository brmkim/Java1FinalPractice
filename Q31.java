/*
Write a test program that reads a 3-by-4 matrix and displays the sum of each
column.
*/
package Final;

import java.util.Scanner;

public class Q31 
{

    public static void main(String[] args) 
    {
        int[][] matrix = new int[3][4];
        matrix = matrixInput(3, 4);
        printInt2DArray(matrix);
        sumEachCol(matrix);
    }
    public static int[][] matrixInput(int r, int c)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for " + r + " x " + c + " matrix: ");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                matrix[i][j] = input.nextInt();
        }
        return matrix;
    }
    public static void sumEachCol(int[][] matrix)
    {
        int[] sumArray = new int[matrix[0].length];
        
        
            for (int c = 0; c < matrix[0].length; c++)
             {        
                 for (int r = 0; r < matrix.length; r++)
                     sumArray[c] += matrix[r][c];
                
                 System.out.print(sumArray[c] + " ");
             }
    }
    public static void printInt2DArray(int[][] matrix)
    {
        for (int r = 0; r < matrix.length; r++)
        {
            for (int c = 0; c < matrix[r].length; c++)
                System.out.print(matrix[r][c] + " ");
            
            System.out.println();
        }
    }
}
