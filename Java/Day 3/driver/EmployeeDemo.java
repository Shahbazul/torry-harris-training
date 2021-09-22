package com.torryharris.driver;

import com.torryharris.model.Clerk;
//import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        /*
        Employee e1=new Employee("Ram",1001,"Manager",50000);
        Employee e2=new Employee("Akber",1002,"Lead",40000);
        Employee e3=new Employee("Amar",1003,"Engineer",30000);
        Employee e4=new Employee("Anthony",1004,"Clerk",20000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);*/

        Manager m = new Manager("Ram",101,"Manager",500000.0f,"JAVA",10);
        Lead l = new Lead("Akber",1002,"Lead",40000.0f,5);
        Clerk c= new Clerk("Amar",1003,"Engineer",300000.0f,"Yes");
        System.out.println(m);
        System.out.println(l);
        System.out.println(c);
    }
}
