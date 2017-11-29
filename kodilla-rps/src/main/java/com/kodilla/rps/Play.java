package com.kodilla.rps;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Play {
    public void play() {

        State state = new GetNameState();

        do {
            state = state.process(state);
        }
        while (!state.equals(null));


//
//        GenerateAtribute generateAtribute = new GenerateAtribute();
//        generateAtribute.generete();
//        Scanner sc = new Scanner(System.in);
//
//        int actualUserScore = 0;
//        int actualComputerScore = 0;
//
//        String name = "";
//
//
//        boolean continueGame = true;
//
//        int victory = 0;
//
//        while (continueGame) {
//
//            InputGameParameters inputGameParameters = new InputGameParameters();
//
//            if (victory == 0) {
//                victory = inputGameParameters.inputVictory();
//                name = inputGameParameters.getName();
//            }
//
//            System.out.println("Your name is: " + name);
//            System.out.println("Victory wiil be after: " + victory);
//
//            while (actualUserScore < victory && actualComputerScore < victory) {
//
//                UserChoseAtribute userChoseAtribute = new UserChoseAtribute();
//
//
//                GameAttribute gameAttributeUser = userChoseAtribute.choseAtribute();
//                GameAttribute gameAttributeComp = generateAtribute.generete();
//
//
//                System.out.println("Your choosen was: " + gameAttributeUser.name());
//                System.out.println("Computer choosen was: " + gameAttributeComp.name());
//
//
//                GameState gameState = new GameState();
//                GameResult result = gameState.game(gameAttributeComp, gameAttributeUser);
//                System.out.println("Result game: " + result.name());
//
//                ActualGameResult actualGameResult = new ActualGameResult(result);
//
//                actualUserScore = +actualUserScore + actualGameResult.getActualUserScore();
//                actualComputerScore = actualComputerScore + actualGameResult.getActualComputerScore();
//
//                actualGameResult.writeActualGameResult(actualUserScore, actualComputerScore);
//
//            }
//
//            if (actualUserScore == victory) {
//                System.out.println("This session you win Congratulation");
//            }
//            if (actualComputerScore == victory) {
//                System.out.println("This session win computer. You are lost");
//                System.out.println("Try again");
//            }
//
//            System.out.println("If you continue game press n ");
//            System.out.println("If you exit game pres x");
//
//            String con = sc.next();
//            Finish finish = new Finish();
//
//            continueGame = finish.endGame(con);
//
//            if (finish.continueGame(con)) {
//                actualUserScore = 0;
//                victory = 0;
//                actualComputerScore = 0;
//            }
//
    }
//
//    }
}
