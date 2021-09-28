package com.torryharris.model;

public class Employee {
    private int eid;
    private String name;
    private String designation;
    private int sal;
    private final int balanceCL=12;

    public Employee(int eid, String name, String designation, int sal) {
        this.eid = eid;
        this.name = name;
        this.designation = designation;
        this.sal = sal;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getBalanceCL() {
        return balanceCL;
    }
}


