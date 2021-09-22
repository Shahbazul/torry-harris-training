package com.torryharris.model;

public class Employee {
    private String name;
    private int employeeID ;
    private String designation;
    private float salary;

    public Employee() {
    }

    public Employee(String name, int employeeID, String designation, float salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void display(){
        System.out.println("Employee: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Employee Designation: "+designation);
        System.out.println("Employee Salary: "+salary);
        System.out.println(" ");
    }
}
