package com.exceptions;

public class TryCatch {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.substring(3, 6));
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("Exception caught");
        }
        System.out.println("Out of try catch block");

    }
}

