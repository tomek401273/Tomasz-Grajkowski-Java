package com.kodilla.rps.state;

import com.kodilla.rps.*;

import java.util.*;
import java.util.regex.Pattern;

public class GetUserAttribute implements State {

    int actualUserScore = 0;
    int actualComputerScore = 0;
    int victory;
    GameContext gameContext;
    boolean correctData;

    public GetUserAttribute(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    @Override
    public void writeMessage() {
        System.out.print("Select and write your chose: ");
        for (GameAttribute gameAttribute : GameAttribute.values()) {
            System.out.print("'" + gameAttribute.name() + "' ");
        }
        System.out.println();
    }

    @Override
    public boolean validadeUserChoice(String dane) {
        gameContext.setCorrectData(false);
        System.out.println("Number victory: " + gameContext.getVictory());
        victory = gameContext.getVictory();
        for (GameAttribute gameAttribute : GameAttribute.values()) {

            if (gameAttribute.name().equals(dane)) {
                gameContext.setUserAtribute(gameAttribute);
                gameContext.setCorrectData(true);
                break;
            }

        }
        if (!gameContext.isCorrectData()) {
            return false;
        }

        boolean goodData = game(gameContext);

        return goodData;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        return Collections.singletonMap(Pattern.compile(".*"), new Summary(gameContext));
    }

    public boolean game(GameContext gameContext) {

        GenerateAtribute generateAtribute = new GenerateAtribute();
        GameAttribute computerAtteibute = generateAtribute.generete();
        gameContext.setComputerAtribute(computerAtteibute);

        System.out.println("You select: " + gameContext.getUserAtribute());
        System.out.println("Computer select: " + gameContext.getComputerAtribute());

        GameState gameState = new GameState();
        GameResult result = gameState.game(gameContext.getComputerAtribute(), gameContext.getUserAtribute());
        System.out.println("Game Result: " + result.name());

        ActualGameResult actualGameResult = new ActualGameResult(result);
        actualUserScore = actualUserScore + actualGameResult.getActualUserScore();
        actualComputerScore = actualComputerScore + actualGameResult.getActualComputerScore();
        gameContext.setActualUserScore(actualUserScore);
        gameContext.setActualComputerScore(actualComputerScore);

        System.out.println("Actual gameContext score is: " + gameContext.getActualUserScore());
        System.out.println("Actual computer score is: " + gameContext.getActualComputerScore());

        if (gameContext.getActualUserScore() < victory && gameContext.getActualComputerScore() < victory) {
            System.out.println("Computer Score is less than victory or gameContext score is less than victory");
            correctData=false;
        } else {
            correctData =true;
            if (gameContext.getActualUserScore() > gameContext.getActualComputerScore()) {
                System.out.println("Congratulation " + gameContext.getName() + " you are winn ");
            } else {
                System.out.println(gameContext.getName() + " this session you are lost");
            }
        }

        return correctData;
    }

}