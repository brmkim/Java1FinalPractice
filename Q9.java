/*
 (Occurrences of a specified character—5 points) Write a recursive method that 
finds the number of occurrences of a specified character in a string using the
following header:
public int count(s, ch):
The String class has the count method. Implement your method without using the 
count method. For example, count("Welcome", 'e') returns 2. Write a test program
that prompts the user to enter a string followed by a character and displays 
the number of occurrences of the character in the string.
 */
package Final;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character to find matches on: ");
        char c = input.next().charAt(0);  // IMPORTANT: to get char var from Scanner method, 
                                          // convert to .charAt(0)
       
        System.out.println("The character " + c + " occurs in that string " +
                count(str, c) + " times.");
    }
    public static int count(String s, char ch)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)  // array.length ;  str.length()
        {
            if (s.charAt(i) == ch)  // (s.charAt(i) == ch) works too
                count += 1;
        }
        return count;
    }
 
}