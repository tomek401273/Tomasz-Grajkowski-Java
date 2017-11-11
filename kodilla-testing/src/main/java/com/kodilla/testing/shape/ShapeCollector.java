package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> schapelist = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        schapelist.add(shape);
    }

    public void removeFigure(Shape shape) {
        schapelist.remove(shape);
    }

    public Shape getFigure(int n) {
        return schapelist.get(n);
    }

    public double showFigure(int n) {
        return schapelist.get(n).getField();
    }
}
