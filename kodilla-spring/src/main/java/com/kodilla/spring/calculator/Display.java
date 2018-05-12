package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void dislpayValue(double val){
        System.out.println("value: " + val);
    }
}

