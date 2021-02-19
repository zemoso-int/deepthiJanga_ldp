package javaassignment.ClassesAndObjects;

/**
 * Write a java program to access methods inside main with and without using static keyword
 */

public class Question2 {

    //Method without static
    public double areaOfTriangle(double base, double height) {
       return (base* height)/2;
    }

    //Method using static
    public static double largestNumber(double n1, double n2, double n3) {
        if( n1 >= n2 && n1 >= n3)
           return n1;

        else if (n2 >= n1 && n2 >= n3)
            return n2;

        else
        return n3;
    }

    public static void main(String[] args) {

        Question2 question2 = new Question2();
        double area = question2.areaOfTriangle(6,8);
        System.out.println("Area of Triangle is : " + area);

        double n = largestNumber(-4.5, 3.9, 2.5);
        System.out.println("largest number is : " + n);
    }

}
