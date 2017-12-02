package com.kodilla.rps.state;

import com.kodilla.rps.*;
import com.kodilla.rps.state.GetNumberVictory;
import com.kodilla.rps.state.State;

import java.util.*;
import java.util.regex.Pattern;

public class GetUserAttribute implements State {

    int actualUserScore = 0;
    int actualComputerScore = 0;
    int victory;

    @Override
    public void writeMessage() {
        System.out.print("Select and write your chose: ");
        for (GameAttribute gameAttribute : GameAttribute.values()) {
            System.out.print("'" + gameAttribute.name() + "' ");
        }
        System.out.println();
    }

    @Override
    public User validadeUserChoice(User user, String dane) {
        User userTemp = user;
        userTemp.setCorrectData(false);
        System.out.println("Number victory: " + userTemp.getVictory());
        victory = userTemp.getVictory();
        for (GameAttribute gameAttribute : GameAttribute.values()) {

            if (gameAttribute.name().equals(dane)) {
                userTemp.setUserAtribute(gameAttribute);
                userTemp.setCorrectData(true);
                break;
            }

        }
        if (!userTemp.isCorrectData()) {
            return userTemp;
        }

        User userTemp2 = game(userTemp);

        return userTemp2;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        return Collections.singletonMap(Pattern.compile(".*"), new Summary());
    }

    public User game(User user) {

        User userTemp = user;

        GenerateAtribute generateAtribute = new GenerateAtribute();
        GameAttribute computerAtteibute = generateAtribute.generete();
        userTemp.setComputerAtribute(computerAtteibute);

        System.out.println("You select: " + userTemp.getUserAtribute());
        System.out.println("Computer select: " + userTemp.getComputerAtribute());

        GameState gameState = new GameState();
        GameResult result = gameState.game(userTemp.getComputerAtribute(), userTemp.getUserAtribute());
        System.out.println("Game Result: " + result.name());

        ActualGameResult actualGameResult = new ActualGameResult(result);
        actualUserScore = actualUserScore + actualGameResult.getActualUserScore();
        actualComputerScore = actualComputerScore + actualGameResult.getActualComputerScore();
        userTemp.setActualUserScore(actualUserScore);
        userTemp.setActualComputerScore(actualComputerScore);

        System.out.println("Actual user score is: " + userTemp.getActualUserScore());
        System.out.println("Actual computer score is: " + userTemp.getActualComputerScore());

        if (userTemp.getActualUserScore() < victory && userTemp.getActualComputerScore() < victory) {
            System.out.println("Computer Score is less than victory or user score is less than victory");
            userTemp.setCorrectData(false);
        } else {
            userTemp.setCorrectData(true);
            if (userTemp.getActualUserScore() > userTemp.getActualComputerScore()) {
                System.out.println("Congratulation " + userTemp.getName() + " you are winn ");
            } else {
                System.out.println(userTemp.getName() + " this session you are lost");
            }
        }

        return user;
    }

}