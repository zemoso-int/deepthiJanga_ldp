package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args)
    {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<String> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add("a");
        list2.add("b");
        set.add(list1);
        set.add(list2);

        System.out.println(set);
        System.out.println(set.size());

            }
}
