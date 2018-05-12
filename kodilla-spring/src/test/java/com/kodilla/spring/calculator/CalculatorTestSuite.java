package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest //nie wiem dlaczego mi nie przechodzi z SpringBootTest
@ContextConfiguration
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double testAdd = calculator.add(1,1);
        double testSub = calculator.sub(4,3);
        double testMul = calculator.mul(4,5);
        double testDiv = calculator.div(10,5);
        //Then
        Assert.assertEquals(2,testAdd,6);
        Assert.assertEquals(1,testSub,6);
        Assert.assertEquals(20,testMul,6);
        Assert.assertEquals(2,testDiv,6);
    }

}
