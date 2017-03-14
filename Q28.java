/*
Write a one line statement to declare and instantiate and ArrayList named 
names. Write another line to display the content of names after the following 
lines have been executed. What is the output?
names.add("Annie");
names.add("Bob");
names.add("Charles");
names.set(2, "Doug");
names.add(0, "Evelyn");
 */
package Final;

import java.util.ArrayList;

public class Q28 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Annie");
        names.add("Bob");
        names.add("Charles");
        names.set(2, "Doug");
        names.add(0, "Evenlyn");
        System.out.println(names);
        
        // output: [Evenlyn, Annie, Bob, Doug]
    }
    
}
