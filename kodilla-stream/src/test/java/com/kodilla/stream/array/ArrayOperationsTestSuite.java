package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

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
        double calculatedAverage = ArrayOpperations.getAverage(tab);
        double predicedAverage = 3.0;

        //Then
        Assert.assertEquals(predicedAverage, calculatedAverage,0.1);
    }

}
