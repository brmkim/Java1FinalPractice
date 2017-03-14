/*
(Largest row and column) Write a program that randomly fills in 0s and 1s into 
a 4-by-4 matrix, prints the matrix, and finds the first row and column with 
the most 1s. Here is a sample run of the program:
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2
 */

// The function in this class works for any 2D array size
package Final;

public class Q33 {

    public static void main(String[] args) 
    {
        
        int[][] fourbyfour = new int [5][4];  // changed the array size for testing
        for (int r = 0; r < fourbyfour.length; r++)
        {
            for (int c = 0; c < fourbyfour[0].length; c++)
                fourbyfour[r][c] = (int) (Math.random() * 2);
        }
        printInt2DArray(fourbyfour);
        System.out.println("Number of first row with most 1s: " 
                + mostOnesRow(fourbyfour));
        System.out.println("Number of first column with most 1s: " 
                + mostOnesCol(fourbyfour));
        
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
     public static int mostOnesRow(int[][] matrix)
     {
         int max = 0;
         int[] totals = new int [matrix.length];
         for (int r = 0; r < matrix.length; r++)
        {
            int total = 0;
            for (int c = 0; c < matrix[0].length; c++)
                total += matrix[r][c];
            
            if (total > max)
                max = total;
            totals[r] = total;          
        }
         return indexOfMax(totals, max);
     }
     public static int mostOnesCol(int[][] matrix)
     {
         int max = 0;
         int[] totals = new int [matrix[0].length];
         for (int c = 0; c < matrix[0].length; c++)
        {
            int total = 0;
            for (int r = 0; r < matrix.length; r++)
            {   total += matrix[r][c];  
            
            if (total > max)
                max = total;
            totals[c] = total;            
            }
        }
         return indexOfMax(totals, max);
     }
     public static int indexOfMax(int[] ar, int max)
     {
         int error = -1;
         for (int i = 0; i < ar.length; i++)
         {
             if (ar[i] == max)
                 return i;
         }
         return error;
     }

}
