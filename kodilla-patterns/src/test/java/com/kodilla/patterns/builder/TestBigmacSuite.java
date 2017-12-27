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
                .roll(Rol.roolWithsesame)
                .burgers(2)
                .sauce(Sauce.sauce1000Inlands)
                .ingredient(Ingrediets.bacon)
                .ingredient(Ingrediets.cheese)
                .ingredient(Ingrediets.chiliPepers)
                .ingredient(Ingrediets.cucumber)
                .ingredient(Ingrediets.lettuce)
                .ingredient(Ingrediets.onion)
                .ingredient(Ingrediets.strips)
                .ingredient(Ingrediets.mushroms)
                .build();
        System.out.println(bigmac.toString());
        //When
        Rol rol = bigmac.getRol();
        int burgers = bigmac.getBurgers();
        Sauce sauce = bigmac.getSauce();
        List<Ingrediets> ingredients = bigmac.getIngrediets();

        Rol rollExpected = Rol.roolWithsesame;
        int burgersExpected = 2;
        Sauce sauceExpected = Sauce.sauce1000Inlands;
        List<Ingrediets> ingredientsExpected = new ArrayList<>();
        ingredientsExpected.add(Ingrediets.bacon);
        ingredientsExpected.add(Ingrediets.cheese);
        ingredientsExpected.add(Ingrediets.chiliPepers);
        ingredientsExpected.add(Ingrediets.cucumber);
        ingredientsExpected.add(Ingrediets.lettuce);
        ingredientsExpected.add(Ingrediets.onion);
        ingredientsExpected.add(Ingrediets.strips);
        ingredientsExpected.add(Ingrediets.mushroms);


        Assert.assertEquals(rollExpected,rol);
        Assert.assertEquals(burgersExpected,burgers);
        Assert.assertEquals(sauceExpected,sauce);
        Assert.assertEquals(ingredientsExpected,ingredients);

    }
}
