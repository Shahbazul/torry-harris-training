package com.torryharris.collection;

import com.torryharris.model.Employee;

import java.util.HashMap;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Kohli", "Manager", 5000);
        Employee e2 = new Employee(1002, "Zaheer", "SD", 4000);
        Employee e3 = new Employee(1003, "Dhoni", "SE", 3000);
        HashMap<Integer, Employee> employee = new HashMap<>();
        employee.put(e1.geteId(), e1);
        employee.put(e2.geteId(), e2);
        employee.put(e3.geteId(), e3);
        for (int number : employee.keySet()) {
            System.out.println(employee.get(number));
        }


    }
}