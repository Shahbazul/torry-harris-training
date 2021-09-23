package com.torryharris.model;

public class Cow implements Mammal{

    @Override
    public void feed() {
        System.out.println("Cow feed its caf ");
    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass ");
    }
}
