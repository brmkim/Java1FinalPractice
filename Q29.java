/*
(Sum elements column by column) Write a method that returns the sum of all 
the elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
 */
package Final;

public class Q29 
{

    public static void main(String[] args) 
    {
        double[][] test = { 
            {1.1, 2.2, 3.3}, 
            {4.4, 5.5, 6.6}, 
            {7.7, 8.8, 9.9},
            {1.2, 2.3, 3.4},
            {4.5, 5.6, 6.7}};
               
        int chooseColumn = 1;
        printMatrix(test);
        System.out.println("Sum of the colum " + chooseColumn + " is: " 
                + sumColumn(test, 1));
    }
    public static double sumColumn(double[][] m, int columnIndex)
    {
        double sum = 0;
        for (int r = 0; r < m.length; r++)
             sum += m[r][columnIndex];
        
        return sum;
    }
    public static void printMatrix(double[][] array)
    {
        for (int r = 0; r < array.length; r++)
        {
            for (int c = 0; c < array[r].length; c++)
                System.out.print(array[r][c] + " ");
            System.out.println();
        }
    }
}
