package com.kodilla.testing.shape;

public class Square implements Shape {
    private int side;
    private String name;

    public Square( String name, int side) {
        this.side = side;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return side * side;
    }
}
