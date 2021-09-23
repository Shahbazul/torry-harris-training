package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Triangle(10,20);
        shape.area();

        shape = new Rectangle(10,10);
        shape.area();
    }
}
