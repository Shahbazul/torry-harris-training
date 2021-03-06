package com.torryharris.model;

public class Manager extends Employee{
    String projectName;
    int noOfTeams;


    public Manager(String name, int employeeID, String designation, float salary, String projectName, int noOfTeams) {
        super(name, employeeID, designation, salary);
        this.projectName = projectName;
        this.noOfTeams = noOfTeams;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    public void callMeeting(){
        System.out.println("Calling for a meeting ");
    }

    @Override
    public String toString() {
        return "Manager{" +super.toString()+
                "projectName='" + projectName + '\'' +
                ", noOfTeams=" + noOfTeams +
                '}';
    }
}
