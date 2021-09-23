package com.torryharris.model;

public class AirIndia implements Airoplane{
    @Override
    public void fly() {
        System.out.println("AirIndia flies on air");
    }

    @Override
    public void move() {
        System.out.println("AirIndia moves on air");
    }
}
