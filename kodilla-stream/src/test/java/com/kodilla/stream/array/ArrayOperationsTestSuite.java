package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void ArrayOpperationsTestSuite(){
        //Given
        int [] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

        //When
        OptionalDouble calzculatedAverage = ArrayOpperations.getAverage(tab);
        OptionalDouble predicedAverage = OptionalDouble.of(3.0);

        //Then

        Assert.assertEquals(predicedAverage, calzculatedAverage);
    }

    @Test
    public void ArrayOperationsTestSuite2(){
        //Given
        int [] tab = new int[5];
        tab[0] = 1;
        tab[1] = 1;
        tab[2] = 1;
        tab[3] = 1;
        tab[4] = 1;

        //When
        OptionalDouble calculatedAverage = ArrayOpperations.getAverage(tab);
        OptionalDouble predicedAverage = OptionalDouble.of(1.0);

        //Then
        Assert.assertEquals(predicedAverage, calculatedAverage);
    }
}
