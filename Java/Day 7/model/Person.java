package com.torryharris.model;

public class Person implements Comparable<Person>{
    private Long aadhaarCard;
    private String name;
    private String state;
    private String occupation;

    public Person() {
    }

    public Person(Long aadhaarCard, String name, String state, String occupation) {
        this.aadhaarCard = aadhaarCard;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
    }

    public Long getAadhaarCard() {
        return aadhaarCard;
    }

    public void setAadhaarCard(Long aadhaarCard) {
        this.aadhaarCard = aadhaarCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "aadhaarCard=" + aadhaarCard +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return (this.getAadhaarCard().compareTo(o.getAadhaarCard()));
    }
}
