package com.torryharris.driver;

public class WrapperDemo {
    public static void main(String[] args) {
        int a=10;
        Integer iobj=a;        //boxing
        int b=iobj;            //Unboxing
        System.out.println(iobj);

        Integer o1=iobj+10;

        String str="1234";
        System.out.println(str+10);

        int number = Integer.parseInt(str);
        System.out.println(number+10);
    }
}
