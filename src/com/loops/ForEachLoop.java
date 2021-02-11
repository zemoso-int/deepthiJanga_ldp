package com.loops;

import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String args[]){
        //Creating a list of elements
        ArrayList<String> list=new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("Java Script");
        //traversing the list of elements using for-each loop
        for(String s:list){
            System.out.println(s);
        }

    }
}
