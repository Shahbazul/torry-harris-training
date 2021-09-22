package com.torryharris.model;

public class Suv extends Car{
    String driveMode;
    boolean sunRoof;

    public Suv(String name, String fuelType, int engineCapacity, float power,
               int noOfGears, Tyre tyre, MusicSystem ms, String driveMode, boolean sunRoof) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre, ms);
        this.driveMode = driveMode;
        this.sunRoof = sunRoof;
    }

    public void displaySuvFeatures(){
        displayFeatures();
        System.out.println("Drive Mode: "+driveMode);
        System.out.println("Sun Roof: "+sunRoof);
        System.out.println();
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
}
