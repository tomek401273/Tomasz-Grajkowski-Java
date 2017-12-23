package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    //  private static Logger logger;
    @Test
    public void testLog() {
        //Given
        //When
//        logger = new Logger();
//        logger.log("Adam");
        Logger.getInstance().log("Adam");

    }

    @Test
    public void testGetLastLogg() {
          //Given
//        //When
//        String lastLog = logger.getLastLog();
//        System.out.println("Last log: "+lastLog);
//        //Then
//        Assert.assertEquals("Adam",lastLog);
        //Given
        // When
        String lastlog = Logger.getInstance().getLastLog();
        System.out.println("Last log: "+ lastlog);
        Assert.assertEquals("Adam", lastlog);
    }

}
