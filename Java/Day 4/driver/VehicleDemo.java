package com.torryharris.driver;

import com.torryharris.model.*;

public class VehicleDemo {
    public static void main(String[] args) {
        Car swift = new Swift();
        swift.changeGear();
        swift.move();

        Boat titanic  = new Titanic();
        titanic.floats();
        titanic.move();

        Airoplane airIndia = new AirIndia();
        airIndia.fly();
        airIndia.move();
    }
}
