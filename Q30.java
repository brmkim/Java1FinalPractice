/*
Assume int[][][] x = new char[12][5][2], how many elements are in the array? 
What are x.length, x[2].length, and x[0][0].length?
 */

// int[][]][] for char array???

package Final;

public class Q30 
{
    public static void main(String[] args) 
    {
        char [][][] x = new char[12][5][2];
        System.out.println(x.length);    // 12
        System.out.println(x[2].length); // 5
        System.out.println(x[0][0].length); //2
    }
    
    
}
