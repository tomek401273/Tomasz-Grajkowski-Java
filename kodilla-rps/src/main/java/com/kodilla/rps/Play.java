package com.kodilla.rps;

import java.util.Scanner;

public class Play {
    public void play() {

        int round = 0;

        GenerateNumber generateNumber = new GenerateNumber();
        Scanner sc = new Scanner(System.in);
        int userWin = 0;
        while (userWin < 3) {

            System.out.println("Chose number response thing: 1 Rock, 2 Scissors, 3 Paper");
            int chossenNumber = sc.nextInt();

            int generetedNumber = generateNumber.generete();

            GameState gameState = new GameState();
            userWin = gameState.game(chossenNumber, generetedNumber);
            round++;
            System.out.println("Round numer: " + round);
            System.out.println();
        }
    }
}
