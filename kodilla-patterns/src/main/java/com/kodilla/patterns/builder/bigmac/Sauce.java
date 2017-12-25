package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String sauceStandard = "Sauce Standard";
    public static final String sauce100Wysp = "Sauce 1000 Wysp";
    public static final String sauceBarbecue = "Sauce Barbecue";
    final private String souce;

    public Sauce(String souce) {
        this.souce = souce;
    }
    public String getSouce() {
        return souce;
    }
}
