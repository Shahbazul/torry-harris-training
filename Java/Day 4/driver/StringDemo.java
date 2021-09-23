package com.torryharris.driver;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1="abcd";
        String s2=new String("efgh");
        String s3="abcd";
        String s4= scan.next();

        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4+" "+s4.hashCode());

        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s2+" "+s2.hashCode());

    }
}
