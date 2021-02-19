package javaassignment.LoopsAndConditionsAssignment;

/**
 * Question: Declare an array with 10 names. Find the index of a given name.
 */
public class Question3 {

    static String[] name = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "August", "Sep", "Oct"};

    public static void indexOfGivenName(String names) {
        int index = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(names)) {
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        indexOfGivenName("May");
    }
}
