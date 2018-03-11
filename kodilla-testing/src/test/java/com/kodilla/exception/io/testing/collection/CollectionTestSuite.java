package com.kodilla.exception.io.testing.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CollectionTestSuite {

    private OddNumbersExterminator exterminator;
    @Before
    public void before() {
        exterminator = new OddNumbersExterminator();
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> numbers = prepareNumbers();
        ArrayList<Integer> theEvenNumbers = generateExpectedNumbers();
        //When

        //Then
        assertEquals(theEvenNumbers, exterminator.exterminate(numbers));
    }

    private ArrayList<Integer> generateExpectedNumbers() {
        ArrayList<Integer>theEvenNumbers = new ArrayList<>();
        for( int j = 0; j < 100; j +=2 ) {
            theEvenNumbers.add(j);
        }
        return theEvenNumbers;
    }

    private ArrayList<Integer> prepareNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        ArrayList<Integer> result = exterminator.exterminate(new ArrayList<>());

        assertTrue(result.isEmpty());

    }
}
