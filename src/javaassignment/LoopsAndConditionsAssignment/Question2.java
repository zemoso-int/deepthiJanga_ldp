package javaassignment.LoopsAndConditionsAssignment;

/**
 * Question: Count the Size of the array without using any inbuilt functions
 */

public class Question2 {
  static String[] array ={"a","b","c","d","e","f","g","h"};
    public static void calculateLengthOfArray(){
        int i=0;
        for(String k:array){
            i++;
        }
        System.out.println("Count of array is " +  i);
    }
    public static void main(String[] args){

        calculateLengthOfArray();
    }
}
