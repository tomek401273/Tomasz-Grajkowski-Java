package com.kodilla.rps;

import java.util.Scanner;

public class Play {
    public void play() {

        GenerateNumber generateNumber = new GenerateNumber();
        Scanner sc = new Scanner(System.in);
        int userWin = 0;
        int winComputer = 0;
        int win = 0;
        int victory = 0;
        String name = "";

        boolean continueGame = true;

        while (continueGame) {

            if (victory == 0) {
                System.out.println("Write your name");
                name = sc.next();
                System.out.println("How many rounds will be victory?");
                victory = sc.nextInt();
            }


            System.out.println("Your name is: " + name);
            System.out.println("Victory wiil be after: " + victory);

            while (userWin < victory && winComputer < victory) {

                System.out.println("Chose number response thing: 1 Rock, 2 Scissors, 3 Paper");
                int chossenNumber = sc.nextInt();
                int generetedNumber = generateNumber.generete();

                if (generetedNumber == 1) {

                    System.out.println("Computer choosen: Rock");
                } else if (generetedNumber == 2) {
                    System.out.println("Computer choosen: Scissors");
                } else if (generetedNumber == 3) {
                    System.out.println("Computer choosen: Paper");
                }

                GameState gameState = new GameState();
                win = gameState.game(chossenNumber, generetedNumber, victory);
                if (win == 1) {
                    System.out.println("You Lose!!!");
                    winComputer++;
                }
                if (win == 2) {
                    System.out.println("Remis!!!");
                }
                if (win == 3) {
                    System.out.println("You winn!!!");
                    userWin++;
                }

                System.out.println("user win " + userWin);
                System.out.println("winComputer: " + winComputer);
                System.out.println();
            }

            if(userWin==victory){
                System.out.println("This session you win Congratulation");
            }
            if (winComputer==victory){
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
                    userWin = 0;
                    victory = 0;
                    winComputer = 0;
                }

            }
        }

    }
}
