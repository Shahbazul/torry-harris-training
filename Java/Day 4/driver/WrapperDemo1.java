package com.torryharris.driver;

import java.util.Scanner;

public class WrapperDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String integer=scan.next();
        String floatValue=scan.next();

        int intValue = Integer.parseInt(integer);
        float floatVal = Float.parseFloat(floatValue);

        System.out.println(intValue*2);
        System.out.println(floatVal*2);
    }
}
