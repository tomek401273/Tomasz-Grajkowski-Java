package com.kodilla.rps;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Play {
    public void play() {

        //GenerateNumber generateNumber = new GenerateNumber();
        GenerateAtribute generateAtribute = new GenerateAtribute();
        generateAtribute.generete();
        Scanner sc = new Scanner(System.in);

        int actualUserScore = 0;
        int actualComputerScore = 0;
        int win = 0;
        int victory = 0;
        boolean incorectVicotry = false;
        String name = "";
        boolean corectInputVicory = false;
        boolean corectChose = false;
        boolean continueGame = true;
        String usersChoice = null;

        while (continueGame) {

            while (!corectInputVicory) {
                System.out.println("Write your name");
                name = sc.next();
                if (victory == 0) {

                    System.out.println("How many rounds will be victory?");

                    try {
                        victory = sc.nextInt();
                    } catch (NoSuchElementException e) {
                        System.out.println("Please write number as amount vicory");
                        incorectVicotry = true;
                    }
                    if (!incorectVicotry) {
                        corectInputVicory = true;
                    } else {
                        incorectVicotry = false;
                    }
                    System.out.println();

                }
            }

            System.out.println("Your name is: " + name);
            System.out.println("Victory wiil be after: " + victory);

            while (actualUserScore < victory && actualComputerScore < victory) {

                System.out.print("Select and write your chose: ");
                for (GameAttribute gameAttribute : GameAttribute.values()) {
                    System.out.print("'" + gameAttribute.name() + "' ");
                }
                System.out.println();

                while (!corectChose) {
                    try {
                        usersChoice = sc.next();
                    } catch (NoSuchElementException e) {
                        System.out.println("Please insert corectChoose");
                    }

                    for (GameAttribute gameAttribute : GameAttribute.values()) {
                        if (gameAttribute.name().equals(usersChoice)) {
                            corectChose = true;
                            break;
                        }
                    }

                    System.out.print("Select and write your chose: ");
                    for (GameAttribute gameAttribute : GameAttribute.values()) {
                        System.out.print("'" + gameAttribute.name() + "' ");
                    }
                    System.out.println();


                }
                corectChose = false;
                GameAttribute gameAttributeComp = generateAtribute.generete();

                String finalUsersChoice = usersChoice;
                GameAttribute gameAttributeUser = Arrays.stream(GameAttribute.values())
                        .filter(gameAttribute1 -> gameAttribute1.name().equals(finalUsersChoice))
                        .findFirst()
                        .get();
                System.out.println("Your choosen was: " + gameAttributeUser.name());
                System.out.println("Computer choosen was: " + gameAttributeComp.name());


                GameState gameState = new GameState();
                GameResult result = gameState.game(gameAttributeComp, gameAttributeUser);
                System.out.println("Result game: " + result.name());

//                if (result.name().equals("win")) {
//                    actualUserScore++;
//                }
//                if (result.name().equals("fail")) {
//                    actualComputerScore++;
//                }
//                if (result.name().equals("draw")) {
//                }
                if(result.equals(GameResult.win)){
                    actualUserScore++;
                }
                if(result.equals(GameResult.fail)){
                    actualComputerScore++;
                }


                System.out.println("Actual User score " + actualUserScore);
                System.out.println("Actual Computer score: " + actualComputerScore);
                System.out.println();
            }

            if (actualUserScore == victory) {
                System.out.println("This session you win Congratulation");
            }
            if (actualComputerScore == victory) {
                System.out.println("This session win computer. You are lost");
                System.out.println("Try again");
            }

            System.out.println("If you continue game press n ");
            System.out.println("If you exit game pres x");

            String con = sc.next();
            if (con.equals("x")) {
                System.out.println("Are you sure end geme");
                System.out.println("Write 'y' if you end game or 'n' if you no end game");
                String end = sc.next();
                if (end.equals("y")) {
                    continueGame = false;
                }
            }
            if (con.equals("n")) {
                System.out.println("Are you sure end actual game?");
                System.out.println("Write 'y' if you end game and start new game  or 'n' if you no new game");
                String runNewGame = sc.next();
                if (runNewGame.equals("y")) {
                    System.out.println("you are starting new game");
                    actualUserScore = 0;
                    victory = 0;
                    actualComputerScore = 0;
                    corectInputVicory = false;

                }

            }
        }

    }
}
