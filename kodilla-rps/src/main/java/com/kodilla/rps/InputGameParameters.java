package com.kodilla.rps;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputGameParameters {

    boolean corectInputVicory = false;
    int victory = 0;
    boolean incorectVicotry = false;
    String name="";
    Scanner sc = new Scanner(System.in);


    public String inputName(){

        System.out.println("Write your name");
        return sc.next();
    }

    public int inputVictory() {
        while (!corectInputVicory) {

            name=  inputName();


                System.out.println("How many rounds will be victory?");

                try {
                    victory = sc.nextInt();
                } catch (NoSuchElementException e) {
                    System.out.println("Please write number as amount vicory");
                    incorectVicotry = true;
                }
                if (!incorectVicotry) {
                    corectInputVicory = true;
                    break;
                } else if (incorectVicotry) {
                    incorectVicotry = false;
                }
                System.out.println();


        }
        return victory;
    }

    public String getName() {
        return name;
    }
}
