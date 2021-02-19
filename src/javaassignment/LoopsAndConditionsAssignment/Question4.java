package javaassignment.LoopsAndConditionsAssignment;

/**
 * Write a program for 5! (5 factorial)- 5x4x3x2x1
 */

public class Question4 {

    public static void factorialOfANumber(int num){
        int factorial=1;
        for(int i=1; i<=num; i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args){
        factorialOfANumber(5);
    }
}
