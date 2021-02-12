package collections;

import java.util.LinkedList;

class LinkedLists {

    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll
                = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        ll.add(1,"Java");
        ll.set(0,"OOPS");
        ll.add(2,"Python");
        System.out.println(ll);

        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");

    }
}
