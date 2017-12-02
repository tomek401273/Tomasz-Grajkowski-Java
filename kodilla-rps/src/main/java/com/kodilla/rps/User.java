package com.kodilla.rps;

public class User {
    private String name;
    private int victory;
    private boolean correctData;
    private GameAttribute userAtribute;
    private GameAttribute computerAtribute;
    private int actualUserScore;
    private int actualComputerScore;
    private boolean totalUserWin;


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

    public boolean isCorrectData() {
        return correctData;
    }

    public void setCorrectData(boolean correctData) {
        this.correctData = correctData;
    }

    public GameAttribute getUserAtribute() {
        return userAtribute;
    }

    public void setUserAtribute(GameAttribute userAtribute) {
        this.userAtribute = userAtribute;
    }

    public GameAttribute getComputerAtribute() {
        return computerAtribute;
    }

    public void setComputerAtribute(GameAttribute computerAtribute) {
        this.computerAtribute = computerAtribute;
    }

    public int getActualUserScore() {
        return actualUserScore;
    }

    public int getActualComputerScore() {
        return actualComputerScore;
    }

    public void setActualUserScore(int actualUserScore) {
        this.actualUserScore = actualUserScore;
    }

    public void setActualComputerScore(int actualComputerScore) {
        this.actualComputerScore = actualComputerScore;
    }

    public boolean isTotalUserWin() {
        return totalUserWin;
    }

    public void setTotalUserWin(boolean totalUserWin) {
        this.totalUserWin = totalUserWin;
    }
}
