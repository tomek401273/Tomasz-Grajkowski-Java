package com.kodilla.patterns.builder.bigmac;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Getter
@RequiredArgsConstructor
public enum Ingrediets {
lettuce("lettuce"), onion("onion"), bacon("bacon"), cucumber("cucumber"), chiliPepers("chiliPeppers"),mushroms("mushrooms"), strips("shrips"), cheese("cheese");
    final String ingredient;
}
