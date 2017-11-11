package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private int radius;

    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 3.14*radius*radius;
    }
}
