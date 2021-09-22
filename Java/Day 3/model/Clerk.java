package com.torryharris.model;

public class Clerk extends Employee{
    String degree;

    public Clerk(String name, int employeeID, String designation, float salary, String degree) {
        super(name, employeeID, designation, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void generatePayRlls(){
        System.out.println("Generate Payrolls ");
    }

    @Override
    public String toString() {
        return "Clerk{" +super.toString()+
                "degree='" + degree + '\'' +
                '}';
    }
}
