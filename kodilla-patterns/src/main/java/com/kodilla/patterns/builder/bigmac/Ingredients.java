package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
    public static final String lettuce = "lettuce";
    public static final String onion = "onion";
    public static final String bacon = "bacon";
    public static final String cucumber = "cucumber";
    public static final String chiliPeppers = "chiliPeppers";
    public static final String mushroms = "mushrooms";
    public static final String shrips = "shrips";
    public static final String cheese = "cheese";
    private final List<String> ingredients;

    public Ingredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
