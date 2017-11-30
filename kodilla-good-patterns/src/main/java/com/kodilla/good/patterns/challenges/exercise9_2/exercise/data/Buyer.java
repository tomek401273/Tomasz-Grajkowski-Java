package com.kodilla.good.patterns.challenges.exercise9_2.exercise.data;

public class Buyer {
    private String name;
    private String surname;
    private String addres;

    public Buyer(String name, String surname, String addres) {
        this.name = name;
        this.surname = surname;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddres() {
        return addres;
    }
}
