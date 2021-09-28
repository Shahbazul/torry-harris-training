package com.torryharris.drive;

import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<>();
        sList.add("Hello");
        sList.add("World");
        System.out.println(sList);

        ArrayList<Float> fList = new ArrayList<>();
        fList.add(20.2f);
        fList.add(10.2f);
        System.out.println(fList);

        ArrayList<Double> dList = new ArrayList<>();
        dList.add(20.0);
        dList.add(30.0);
        System.out.println(dList);

        Employee e1= new Employee(10,"Kohli","Manager",50000);
        Employee e2= new Employee(20,"Dhoni","SD",40000);
        Employee e3= new Employee(30,"Zaheer","SE",30000);

        ArrayList<Employee>empList= new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        for (int i=0;i<empList.size();i++){
            System.out.println(empList.get(i));
        }

        for(Employee employee:empList){
            System.out.println(employee);
        }

        System.out.println("*********************");
        Iterator<Employee>employeeIterator=empList.iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

        ArrayList<Object>oList= new ArrayList<>();
        oList.add(10);
        oList.add(10.0f);
        oList.add("Hello");
        oList.add(10.00);
        oList.add(e2);
        for(Object obj:oList){
            System.out.println(obj);
        }

    }
}
