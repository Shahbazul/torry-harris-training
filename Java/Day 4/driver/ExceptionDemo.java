package com.torryharris.driver;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        b= scan.nextInt();
        c= scan.nextInt();
        try{
            if(c==0){
                throw new ArithmeticException("DIVIDE BY ZERO");
            }else{
                a=b/c;
            }
        }catch (ArithmeticException ex){
            System.out.println("Exception caught");
            System.out.println(ex);
        }
        System.out.println("After if-else statement");
    }
}
