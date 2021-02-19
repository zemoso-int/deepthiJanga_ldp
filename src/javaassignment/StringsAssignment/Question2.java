package javaassignment.StringsAssignment;

/**
 * Question 2: Write a program to reverse a String without using reverse logic and built-in reverse() method in Java
 */

public class Question2 {

    public static void main(String[] args){
        String reverse = "";
        String name="ZemosoLabs";
        for(int i=name.length()-1; i>=0; i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }
}
