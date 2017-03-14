/*(2 points) Write a method to find the maximum element in an array of doubles. 
The method should accept as input an array of doubles and return the value of 
the largest element in the array.
 */
package Final;

public class Q1 {

    public static void main(String[] args) 
    {
        double[] anArray = {2.3, 1.2, 92.1, 3.45, 10.11, 83.6};
        System.out.println(maxVal(anArray));
    }
    private static double maxVal(double[] anArray)
    {
        double maxValue = anArray[0];
        for (int i = 1; i < anArray.length; i++)
        {
            if (anArray[i] > maxValue)
                maxValue = anArray[i];
        }
        
        return maxValue;
    }
}
