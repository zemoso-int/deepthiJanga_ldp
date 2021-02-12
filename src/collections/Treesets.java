package collections;

import java.util.TreeSet;

public class Treesets {
    public static void main(String[] args)
    {
        TreeSet<String> ts1 = new TreeSet<String>();

        // Elements1 are added using add() method
        ts1.add("Cat");
        ts1.add("Ball");
        ts1.add("DOg");
        ts1.add("Apple");

        // Duplicates will not get insert
        ts1.add("Cat");

        // Elements1 get stored in default natural Sorting Order(Ascending)
        System.out.println(ts1);

        String check = "Ball";

        // Check if the above string exists1 in the treeset or not
        System.out.println("Contains " + check
                + " " + ts1.contains(check));

        // Print the first element in the TreeSet
        System.out.println("First Value " + ts1.first());

        // Print the last element in the TreeSet
        System.out.println("Last Value " + ts1.last());

        String val = "Geek";

        // Find the values just greater and smaller than the above string
        System.out.println("Higher " + ts1.higher(val));
        System.out.println("Lower " + ts1.lower(val));

        System.out.println("Initial TreeSet " + ts1);

        // Removing the element b 
        ts1.remove("B");

        System.out.println("After removing element " + ts1);

        // Removing the first element 
        ts1.pollFirst();

        System.out.println("After removing first " + ts1);

        // Removing the last element 
        ts1.pollLast();

        System.out.println("After removing last " + ts1);
    }

}
