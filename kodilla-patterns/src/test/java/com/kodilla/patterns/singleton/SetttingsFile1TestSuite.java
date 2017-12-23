package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SetttingsFile1TestSuite {
    private static SetttingsFile1 setttingsFile1;

    @BeforeClass
    public static void openSettingsFile() {
        setttingsFile1 = new SetttingsFile1();

        setttingsFile1.open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        setttingsFile1.close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = setttingsFile1.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = setttingsFile1.loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = setttingsFile1.saveSettings();
        //Then
        Assert.assertTrue(result);
    }
}
