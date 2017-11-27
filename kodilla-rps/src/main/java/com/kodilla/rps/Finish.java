package com.kodilla.rps;

import java.util.Scanner;

public class Finish {
    private boolean endGame = true;
    private boolean continueGame = false;
    Scanner sc = new Scanner(System.in);

    public boolean endGame(String con) {

        if (con.equals("x")) {
            System.out.println("Are you sure end geme");
            System.out.println("Write 'y' if you end game or 'n' if you no end game");
            String end = sc.next();
            if (end.equals("y")) {
                endGame = false;
            }
        }
        return endGame;
    }

    public boolean continueGame(String con) {
        if (con.equals("n")) {
            System.out.println("Are you sure end actual game?");
            System.out.println("Write 'y' if you end game and start new game  or 'n' if you no new game");
            String runNewGame = sc.next();
            if (runNewGame.equals("y")) {
                System.out.println("you are starting new game");
                continueGame = true;
            }
        }
        return continueGame;
    }

}
