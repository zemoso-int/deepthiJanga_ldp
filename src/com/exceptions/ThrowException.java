package com.exceptions;

public class ThrowException {
       static int i = -5;
    public static void main(String[] args){
        System.out.println("Before exception");
        if(i < 0)
        try{
            throw new Exception("My exception");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After exception");
    }

    }
