package com.torryharris.drive;

import com.torryharris.comparator.EmployeeNameComparator;
import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeListDemo {
    public static void main(String[] args) {

        Employee e1= new Employee(10,"Kohli","Manager",50000);
        Employee e2= new Employee(20,"Dhoni","SD",40000);
        Employee e3= new Employee(30,"Zaheer","SE",30000);

        ArrayList<Employee> empList= new ArrayList<>();
        empList.add(e1);
        empList.add(e3);
        empList.add(e2);

        for(Employee employee:empList){
            System.out.println(employee);
        }

        System.out.println(" ");
        System.out.println("Sorting by Id");
        empList.sort(null);

        Iterator<Employee> employeeIterator=empList.iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

        System.out.println("Printing Again");
        employeeIterator=empList.iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

        System.out.println("Sorting by name");
        empList.sort(new EmployeeNameComparator());
        employeeIterator=empList.iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }
    }
}
