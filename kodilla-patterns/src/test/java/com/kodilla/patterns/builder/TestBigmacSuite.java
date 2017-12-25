package com.kodilla.patterns.builder;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import com.kodilla.patterns.builder.bigmac.Ingredients;
import com.kodilla.patterns.builder.bigmac.Roll;
import com.kodilla.patterns.builder.bigmac.Sauce;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBigmacSuite {
    @Test
    public void createBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Roll.onSesame)
                .burgers(2)
                .sauce(Sauce.sauce100Wysp)
                .ingredient(Ingredients.bacon)
                .ingredient(Ingredients.cheese)
                .ingredient(Ingredients.chiliPeppers)
                .ingredient(Ingredients.cucumber)
                .ingredient(Ingredients.lettuce)
                .ingredient(Ingredients.onion)
                .ingredient(Ingredients.shrips)
                .ingredient(Ingredients.mushroms)
                .build();
        System.out.println(bigmac.toString());
        //When
        Roll roll = new Roll(bigmac.getRoll());
        int burgers = bigmac.getBurgers();
        Sauce sauce = new Sauce(bigmac.getSauce());
        Ingredients ingredients = new Ingredients(bigmac.getIngredients());

        String rollExpected = "roll with sesame";
        int burgersExpected = 2;
        String sauceExpected = "Sauce 1000 Wysp";
        List<String> ingredientsExpected = new ArrayList<>();
        ingredientsExpected.add(Ingredients.bacon);
        ingredientsExpected.add(Ingredients.cheese);
        ingredientsExpected.add(Ingredients.chiliPeppers);
        ingredientsExpected.add(Ingredients.cucumber);
        ingredientsExpected.add(Ingredients.lettuce);
        ingredientsExpected.add(Ingredients.onion);
        ingredientsExpected.add(Ingredients.shrips);
        ingredientsExpected.add(Ingredients.mushroms);

        Assert.assertEquals(rollExpected,roll.getRoll());
        Assert.assertEquals(burgersExpected,burgers);
        Assert.assertEquals(sauceExpected,sauce.getSouce());
        Assert.assertEquals(ingredientsExpected,ingredients.getIngredients());

    }
}
