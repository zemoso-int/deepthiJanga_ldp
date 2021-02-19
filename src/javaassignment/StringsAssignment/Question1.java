package javaassignment.StringsAssignment;

/**
 * Write a Java program to test if a given string contains the specified word (case-insensitive)
 */

public class Question1 {

   public static boolean containAWord(String string1, String string2){
       return string1.contains(string2);
   }

   public static void main(String[] args){
       System.out.println(containAWord(" Cypress can be written in Javascript and Typescript.", " can"));
   }
}
