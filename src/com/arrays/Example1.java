package com.arrays;

public class Example1 {
    public static void main(String[] args)
    {
        int abc[][]={{2,4,5},{3,2,10},{1,2,9}};
        int min=abc[0][0];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(abc[i][j]<min)
                {
                    min=abc[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
