package com.torryharris.model;

public class Lead extends Employee{
    int teamSize;

    public Lead(String name, int employeeID, String designation, float salary, int teamSize) {
        super(name, employeeID, designation, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void standUpCall(){
        System.out.println("Stand up call ");
    }

    @Override
    public String toString() {
        return "Lead{" +super.toString()+
                "teamSize=" + teamSize +
                '}';
    }
}

