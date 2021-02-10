package com.strings;

public class JavaStrings {

    public static void main(String[] args) {

        String a = " Hello World";
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("e"));
        System.out.println(a.substring(3, 6));
        System.out.println(a.substring(5));
        System.out.println(a.concat(" ...."));
        System.out.println(a.trim());
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        String[] arr =a.split("o");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("W", "T"));

        }
}
