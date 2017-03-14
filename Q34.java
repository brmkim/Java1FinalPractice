/*
(Reverse an integer) Write a method that takes an intger as a parameter and
returns the reverse of the number without converting the integer to a string 
in order to reverse the string and convert it back to an integer 
(e.g., for input 5491 the method returns 1945).
 */
package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class Q34 
{

    public static void main(String[] args) 
    {
        
      ArrayList<Integer> numArrList = new ArrayList<>();  // need ArrayList
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter integers to reverse: ");
      int num = input.nextInt();                         // store input as int
      int temp = 0;                                     // need temp var
      
      numArrList.add(num % 10);   // initial mode
      temp = num / 10;            // initial temp = num / 10
      do
      {
          numArrList.add(temp % 10);     
          temp /= 10;             // next temp is dividing itself by 10 everytime
      } while (temp / 1 != 0);     // while the first digit (last remining) / 1 is not 0
       
      System.out.print(numArrList);

    }
    
}
