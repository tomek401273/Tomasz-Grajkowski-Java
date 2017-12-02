package com.kodilla.rps;

public class User {
    private String name;
    private int victory;
    private boolean correctName;

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getVictory() {
        return victory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }

    public boolean isCorrectName() {
        return correctName;
    }

    public void setCorrectName(boolean correctName) {
        this.correctName = correctName;
    }
}
