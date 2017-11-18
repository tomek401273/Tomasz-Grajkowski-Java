package com.kodilla.rps;

import java.util.Scanner;

public class Play {
    public void play(){
        int userWin=0;

        GenerateNumber generateNumber =new GenerateNumber();
        Scanner sc = new Scanner(System.in);

        while (userWin==0) {

            System.out.println("Chose number response thing: 1 Rock, 2 Scissors, 3 Paper");
            int chossenNumber = sc.nextInt();

            int generetedNumber = generateNumber.generete();

            if (chossenNumber == 1) {
                Rock rock = new Rock();
                userWin = rock.compere(generetedNumber);
            } else if (chossenNumber == 2) {
                Scissors scissors = new Scissors();
                userWin = scissors.compere(generetedNumber);
            } else if (chossenNumber == 3) {
                Paper paper = new Paper();
                userWin = paper.compere(generetedNumber);
            }

            System.out.println("wylosowana liczba to: " + generetedNumber);

            System.out.println("wprowadziłeś liczbe: " + chossenNumber);
        }
    }
}
