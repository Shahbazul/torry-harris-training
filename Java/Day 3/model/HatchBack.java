package com.torryharris.model;

public class HatchBack extends Car{
    String steeringType;

    public HatchBack(String name, String fuelType, int engineCapacity,
                     float power, int noOfGears, Tyre tyre, MusicSystem ms, String steeringType) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre, ms);
        this.steeringType = steeringType;
    }

    public void displayHatchBackFeatures(){
        displayFeatures();
        System.out.println("Steering Type: "+steeringType);
        System.out.println();
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
}
