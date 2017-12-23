package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {

    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstange().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileEngine.getInstange().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = SettingsFileEngine.getInstange().getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getInstange().loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getInstange().saveSettings();
        //Then
        Assert.assertTrue(result);
    }

}
