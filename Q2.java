/*(2 points) Write the code for the linear search method. The method should
accept as input an array of integers and an integer value for the key to be 
searched and it should return an integer: the index in the array
of where the key is found. The method should return -1 if the key is not found.
 */
package Final;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) 
    {
        int[] anArray = {130, 2900, 2, 87, 99, 297, 54, 10, 3, 999, 1200, 111};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int number you wish to find in an array: ");
        int findNum = input.nextInt();
        System.out.println(linSearch(anArray, findNum));
    }
    
    private static int linSearch (int[] array, int findNum)
    {
        int returnVal = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == findNum)
            {  
                returnVal = i;
                break;           
            }
            else
                returnVal = -1;
        }
        return returnVal;
    }
}
