package com.loops;

public class numbers {
    public static void main(String[] args) {


        int k = 1;
        for (int i = 0; i < 6; i++) {
            // (outer for loop) it will loop for 4 times
            for (k = 1; k <= (6 - i); k++) {
                System.out.print(" ");
            }
            {
                //System.out.println("outer loop started");
                for (int j = 1; j <= i; j++) //(inner for loop)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
