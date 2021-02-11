package com.loops;

public class Example3 {
    public static void main(String args[]){
        for(int i=1;i<5;i++)
        // (outer for loop) it will loop for 4 times
        {
            for(int j=1;j<=i;j++) //(inner for loop)
            {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
