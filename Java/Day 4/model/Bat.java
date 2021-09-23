package com.torryharris.model;

public class Bat implements Mammal,Bird{
    @Override
    public void fly() {
        System.out.println("Fly in medium range");
    }

    @Override
    public void feed() {
        System.out.println("Feeds its child");
    }

    @Override
    public void eat() {
        System.out.println("Bat eats insect");
    }
}
