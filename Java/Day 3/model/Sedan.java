package com.torryharris.model;

public class Sedan extends Car{
    int bootSpace;

    public Sedan(String name, String fuelType, int engineCapacity, float power, int noOfGears, Tyre tyre, MusicSystem ms, int bootSpace) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre, ms);
        this.bootSpace = bootSpace;
    }

    public void displaySedanFeatures(){
        displayFeatures();
        System.out.println("Boot Space : "+bootSpace+"Liters");
        System.out.println();
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }


}
