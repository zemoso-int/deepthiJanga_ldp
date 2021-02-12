package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapsAndHashTable {
    public static void main(String[] args)
    {
        // initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("Vaibhav", 20);

        // Iterate the map using for-each loop
        //Map.entry is to separate key and values
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        //initialize a hashtable
        Hashtable<String, Integer> ht = new Hashtable<>(map);
        // Check if a key is present and if present, print value
        if (ht.containsKey("vishal")) {
            Integer a = ht.get("vishal");
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }

    }
}
