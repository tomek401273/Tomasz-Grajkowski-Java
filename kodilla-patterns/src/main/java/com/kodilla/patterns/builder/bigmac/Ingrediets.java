package com.kodilla.patterns.builder.bigmac;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Getter
@RequiredArgsConstructor
public enum Ingrediets {
    lettuce("lettuce"), onion("onion"), bacon("bacon"), cucumber("cucumber"), chiliPepers("chiliPeppers"),mushroms("mushrooms"), strips("shrips"), cheese("cheese");
    final String ingredient;


//    public static final String lettuce = "lettuce";
//    public static final String onion = "onion";
//    public static final String bacon = "bacon";
//    public static final String cucumber = "cucumber";
//    public static final String chiliPeppers = "chiliPeppers";
//    public static final String mushroms = "mushrooms";
//    public static final String shrips = "shrips";
//    public static final String cheese = "cheese";
//    private final List<String> ingredients;
//

}
