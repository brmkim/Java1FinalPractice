/*
(Reverse a string—3 points) Write a method that reverses a string. 
Write a test program that prompts the user to enter a string, 
invokes the reverse function, and displays the reversed string.
 */
package Final;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = input.next();    // take input as string
       char[] charAr = str.toCharArray(); // conver the string into character array
       char[] rev = reverseStr(charAr);   // pass the char array into function. Get char array as an output
       printStr(rev);       // pass the char output as an input to the printStr()
       
    }
    public static char[] reverseStr(char[] charAr)
    {
        char[] reverse = new char[charAr.length];
        for (int i = 0; i < charAr.length; i++)
            reverse[i] = charAr[charAr.length - 1 - i];
        return reverse;
    }
    public static void printStr(char[] charAr)
    {
        for (int i = 0; i < charAr.length; i++)
            System.out.print(charAr[i]);
    }
}
