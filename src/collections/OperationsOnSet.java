package collections;

import java.util.*;

public class OperationsOnSet {
    public static void main(String args[])
    {
        Set<Integer> a = new HashSet<Integer>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

        System.out.println("Contains 9 " + a.contains(9));

        Set<String> c = new HashSet<String>();
        System.out.println("Iterating over set c:");
        c.add("Python");
        c.add("Cypress");
        c.add("Java");
        c.add("OOPS");
        for (String s : c)
            System.out.println(s);

        Set<String> lh = new LinkedHashSet<String>();
        lh.add("Python");
        lh.add("Cypress");
        lh.add("Java");
        lh.add("OOPS");
        System.out.println("Iterating over set lh:");
        Iterator<String> i = lh.iterator();
        while (i.hasNext())
            System.out.println(i.next());
            }
}
