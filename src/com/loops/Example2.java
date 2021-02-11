package com.loops;

public class Example2 {
    public static void main(String args[]){
        int k=1;
        for(int i=1;i<5;i++)
// (outer for loop) it will loop for 4 times
        {
            //System.out.println("outer loop started");
            for(int j=1;j<=i;j++) //(inner for loop)
            {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }
    }

}
