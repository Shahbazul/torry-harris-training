package com.torryharris.model;

public class Swift implements Car{
    @Override
    public void changeGear() {
        System.out.println("Swift Changes Gear");
    }

    @Override
    public void move() {
        System.out.println("Swift moves in road");
    }
}
