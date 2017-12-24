package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.shere.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User thomas = new Millenials("Thomas");
        User steve = new YGeneration("Steve");
        User bill = new ZGeneration("Bill");

        //When
        String thomasShouldShere = thomas.sherePost();
        System.out.println("Thomas should: "+thomasShouldShere);
        String steveShouldShere = steve.sherePost();
        System.out.println("John should: "+steveShouldShere);
        String billShouldShere = bill.sherePost();
        System.out.println("Bill should: "+billShouldShere);

        //Then
        Assert.assertEquals("Publishing post by Twitter",thomasShouldShere);
        Assert.assertEquals("Publishing post by Facebook", steveShouldShere);
        Assert.assertEquals("Publishing post by Snapchat", billShouldShere);


    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User thomas = new Millenials("Thomas");

        //When
        String thomasShouldShere = thomas.sherePost();
        System.out.println("Thomas should shere primary: "+thomasShouldShere);
        thomas.setShere(new FacebookPublisher());
        thomasShouldShere = thomas.sherePost();
        System.out.println("Thomas should shere primary secondary: "+thomasShouldShere);

        Assert.assertEquals("Publishing post by Facebook",thomasShouldShere);
    }
}
