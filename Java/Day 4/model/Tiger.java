package com.torryharris.model;

public class Tiger implements Mammal{
    @Override
    public void feed() {
        System.out.println("Tigress feed its puff");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats meat ");
    }
}
