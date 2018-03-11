package com.kodilla.exception.io.testing.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTest {
    private ShapeCollector collector;


    @Before
    public void before(){
        collector = new ShapeCollector();
    }

    @Test
    public void addingOneShape() {

        Circle circle = new Circle();

        collector.addShape(circle);

        assertEquals(collector.getShape(0), circle);

    }

    @Test
    public void addingNull() {

        collector.addShape(null);

        assertEquals(collector.getShape(0), null);

    }

    @Test
    public void addingCircleAndSquare(){
        Circle circle = new Circle();
        Square square = new Square();

        collector.addShape(circle);
        collector.addShape(square);

        assertEquals(collector.getShape(0), circle);
        assertEquals(collector.getShape(1), square);

    }

    @Test
    public void removeCircleAndSquare(){
        Circle circle = new Circle();
        Square square = new Square();

        collector.removeShape(circle);
        collector.removeShape(square);

        //assertEquals(collector.removeShape(0), circle);
        //assertEquals(collector.removeShape(1), square);
    }

}
