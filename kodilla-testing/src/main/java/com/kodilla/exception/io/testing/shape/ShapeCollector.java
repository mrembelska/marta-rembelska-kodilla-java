package com.kodilla.exception.io.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        if (!shapes.contains(shape)) {
            shapes.add(shape);

        }
    }

    public boolean removeShape(Shape shape) {
        boolean removed = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            removed = true;
        }
        return removed;
    }

    public Shape getShape(int n) {
        if (n<shapes.size() && n>=1) {
            return shapes.get(n);
        }
        return null;
    }
}
