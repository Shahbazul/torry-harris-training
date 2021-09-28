package com.torryharris.model;

public class Employee implements Comparable<Employee>{
    private int eId;
    private String name;
    private String designation;
    private int salary;

    public Employee() {
    }

    public Employee(int eId, String name, String designation, int salary) {
        this.eId = eId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.eId-o.eId;
    }
}
