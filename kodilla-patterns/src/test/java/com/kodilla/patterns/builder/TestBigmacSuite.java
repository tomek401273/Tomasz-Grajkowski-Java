package com.kodilla.patterns.builder;

import com.kodilla.patterns.builder.bigmac.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBigmacSuite {
    @Test
    public void createBigMac() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Rol.roolWithsesame.getRoll())
                .burgers(2)
                .sauce(Sauce.sauce1000Inlands.getSauce())
                .ingredient(Ingrediets.bacon.getIngredient())
                .ingredient(Ingrediets.cheese.getIngredient())
                .ingredient(Ingrediets.chiliPepers.getIngredient())
                .ingredient(Ingrediets.cucumber.getIngredient())
                .ingredient(Ingrediets.lettuce.getIngredient())
                .ingredient(Ingrediets.onion.getIngredient())
                .ingredient(Ingrediets.strips.getIngredient())
                .ingredient(Ingrediets.mushroms.getIngredient())
                .build();
        System.out.println(bigmac.toString());
        //When
        String rol = bigmac.getRoll();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        List<String> ingredients = bigmac.getIngredients();

        String rollExpected = Rol.roolWithsesame.getRoll();
        int burgersExpected = 2;
        String sauceExpected = Sauce.sauce1000Inlands.getSauce();
        List<String> ingredientsExpected = new ArrayList<>();
        ingredientsExpected.add(Ingrediets.bacon.getIngredient());
        ingredientsExpected.add(Ingrediets.cheese.getIngredient());
        ingredientsExpected.add(Ingrediets.chiliPepers.getIngredient());
        ingredientsExpected.add(Ingrediets.cucumber.getIngredient());
        ingredientsExpected.add(Ingrediets.lettuce.getIngredient());
        ingredientsExpected.add(Ingrediets.onion.getIngredient());
        ingredientsExpected.add(Ingrediets.strips.getIngredient());
        ingredientsExpected.add(Ingrediets.mushroms.getIngredient());


        Assert.assertEquals(rollExpected,rol);
        Assert.assertEquals(burgersExpected,burgers);
        Assert.assertEquals(sauceExpected,sauce);
        Assert.assertEquals(ingredientsExpected,ingredients);

    }
}
