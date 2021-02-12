package com.exceptions;

public class ThrowsException {
    public static void main(String[] args){
        ThrowsException te= new ThrowsException();
        te.sum();
        System.out.println("Exception caught");
    }

    public void sum() {
       try{
           div();
       }catch (Throwable e){}
    }

    public void div() throws ArithmeticException{
        int i = 9/0;
    }

}
