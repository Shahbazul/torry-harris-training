package com.torryharris.model;

public class Pigeon implements Bird{

    @Override
    public void fly() {
        System.out.println("Pigeons fly higher ");
    }

    @Override
    public void eat() {
        System.out.println("Pigeons is eating grains ");
    }
}
