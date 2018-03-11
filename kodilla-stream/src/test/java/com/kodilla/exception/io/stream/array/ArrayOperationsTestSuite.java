package com.kodilla.exception.io.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] listOfNumbers = {1,2,3,4,5,15,14};

        //When
        double average = ArrayOperation.getAverage(listOfNumbers);

        //Then
        Assert.assertEquals(8.29, average, 0.01);
    }
}
