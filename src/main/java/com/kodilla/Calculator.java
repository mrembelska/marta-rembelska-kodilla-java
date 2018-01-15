package com.kodilla;

public class Calculator {
    public void someMethod() {
        int a = 10;
        int b = 8;
        int add = a+b;
        int substract = a - b;

        System.out.println("Add: " + add);
        System.out.println("Substract: " + substract);

    }
     public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
     }
}
