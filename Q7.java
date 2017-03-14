/*
(Count single digits—3 points) Write a program that generates 1,000 random 
integers between 0 and 9 and displays the count for each number. 
(Hint: Use a list of ten integers, say counts, to store the counts for the
number of 0s, 1s, ..., 9s.)
 */
package Final;

public class Q7 {

    public static void main(String[] args)
    {
        final int MAX = 1000;
        int count = 0;
        
        
        for (count = 0; count < MAX; count++)
        {
            int rand = (int) (Math.random() * 10);
            System.out.println("Random Num " + (count + 1) + ": " + rand);
        }
    }
    
}
