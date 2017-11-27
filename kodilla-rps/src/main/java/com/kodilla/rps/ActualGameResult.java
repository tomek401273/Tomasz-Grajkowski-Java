package com.kodilla.rps;

public class ActualGameResult {
    private int actualUserScore =0;
    private int actualComputerScore = 0;
    private GameResult gameResult;


    public ActualGameResult(GameResult gameResult) {
        this.gameResult = gameResult;
        gameResult();
    }

    public void gameResult() {
        if (gameResult.equals(GameResult.win)) {
            actualUserScore++;
        }
        if (gameResult.equals(GameResult.fail)) {
            actualComputerScore++;
        }
    }

    public int getActualUserScore() {
        return actualUserScore;
    }

    public int getActualComputerScore() {
        return actualComputerScore;
    }
    public void writeActualGameResult(int userScore, int computerScore) {
        System.out.println("Actual User score " + userScore);
        System.out.println("Actual Computer score: " + computerScore);
        System.out.println();
    }
}
