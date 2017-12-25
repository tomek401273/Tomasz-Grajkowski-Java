package com.kodilla.patterns.builder.bigmac;

public class Roll {
    public static final String onSesame = "roll with sesame";
    public static final String offSesame = "roll without sesame";
    private final String roll;

    public Roll(String roll) {
        this.roll = roll;
    }

    public String getRoll() {
        return roll;
    }
}
