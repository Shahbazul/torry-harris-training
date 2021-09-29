package com.torryharris.model;

import java.util.Objects;

public class Car  {
    private int cassiNo;
    private String carName;
    private String fuelType;
    private Float power;

    public Car() {
    }

    public Car(int cassiNo, String carName, String fuelType, Float power) {
        this.cassiNo = cassiNo;
        this.carName = carName;
        this.fuelType = fuelType;
        this.power = power;
    }

    public int getCassiNo() {
        return cassiNo;
    }

    public void setCassiNo(int cassiNo) {
        this.cassiNo = cassiNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cassiNo=" + cassiNo +
                ", carName='" + carName + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getCarName(), car.getCarName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarName());
    }
}