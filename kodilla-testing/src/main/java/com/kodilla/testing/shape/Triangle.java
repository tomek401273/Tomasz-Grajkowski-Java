package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private int side;
    private int height;

    public Triangle(String name, int side, int height) {
        this.name = name;
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {

        return name;
    }

    @Override
    public double getField() {

        return 0.5*side*height;
    }
}
