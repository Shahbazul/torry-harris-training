package com.torryharris.driver;

import java.util.Scanner;

public class WrapperDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        a= scan.nextInt();

        int b;
        b=scan.nextInt();

        Integer aobj=a;
        Integer bobj=b;

        Integer sum = aobj+bobj;
        Integer dif=aobj-bobj;
        Integer mul=aobj*bobj;
        Integer div=aobj/bobj;

        System.out.println(sum+" "+dif+" "+mul+" "+div);
    }
}
