package javaassignment.ClassesAndObjects;

/**
 * write a java program to access a method inside main which is present in a different class
 */
public class Question3 {

    private static int n1;

    public static int getN1() {
        return n1;
    }

    public static void setN1(int n1) {
        Question3.n1 =n1;
    }

    public void evenOrOdd(int n1) {
        if (n1/2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

}
