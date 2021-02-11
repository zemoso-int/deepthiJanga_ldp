package com.loops;

import java.util.Scanner;

public class printTables {

    private static Scanner sc;

    public static void main(String[] args) {
        int i, j;
        sc = new Scanner(System.in);

        System.out.println("Please Enter the any integer Value below 10: ");
        i = sc.nextInt();

        for (i=1; i <= 10; i++)  {
            for (j = 1; j <= 10; j++)  {
                System.out.format("%d * %d = %d\n",i ,j, i*j);
            }
            System.out.println();
        }
    }
}
