package com.kodilla.exception.io;

import org.junit.Test;

public class TestingMain {
    @Test

    public void TestCalculator() {


        int a = 5;
        int b = 3;
        Calculator calc = new Calculator(a, b);
        int addResult = calc.add(5, 3);
        int subResult = calc.subtract(10, 7);
        if ((addResult == 8) && (subResult == 3)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }
}