/*(3 points) Write code for a method that will accept a sorted array of 
integers, and returns a completely shuffled array.
 */
package Final;

public class Q3 {

    public static void main(String[] args) 
    {
       int[] sortedArray = {1,2,3,4,5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
       int[] shuffledArray = shuffle(sortedArray);
       printArray(shuffledArray);      
    }
    private static int[] shuffle(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int shuffledIndex = (int)(Math.random() * (array.length));
            int temp = array[i];
            array[i] = array[shuffledIndex];
            array[shuffledIndex] = temp;
        }
        return array;
    }
    private static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
    
}

//        for (int i = 0; i < ar.length; i++) // index: 0 - 9
//        {
//            int shuffleIndex = (int) (Math.random() * (ar.length)); // 0 -9
//        
//            int temp = ar[i];
//            ar[i] = ar[shuffleIndex];
//            ar[shuffleIndex] = temp;
