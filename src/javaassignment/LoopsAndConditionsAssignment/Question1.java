package javaassignment.LoopsAndConditionsAssignment;

/**
 * Print multiplication tables for 2 and 3
 * 2*1=2
 * 2*2=4
 */

public class Question1 {

    public static void multiplicationOfNumber(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        multiplicationOfNumber(2);
        System.out.println(" ");
        multiplicationOfNumber(3);
    }
}
