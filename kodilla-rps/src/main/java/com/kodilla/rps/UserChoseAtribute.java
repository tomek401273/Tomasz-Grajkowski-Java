package com.kodilla.rps;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserChoseAtribute {
    private boolean corectChose = false;
    private String usersChoice = null;
    Scanner sc = new Scanner(System.in);


    public GameAttribute choseAtribute() {

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

        String finalUsersChoice = usersChoice;
        GameAttribute gameAttributeUser = Arrays.stream(GameAttribute.values())
                .filter(gameAttribute1 -> gameAttribute1.name().equals(finalUsersChoice))
                .findFirst()
                .get();






        return gameAttributeUser;
    }
}
