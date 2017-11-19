package com.kodilla.rps;

import java.util.List;

public interface Data {
    default int compere(int generetedNumber) {

        if (generetedNumber == getIsWeekerThan().get(0)) {
            System.out.println("Computer chosen: " + getIsStrongerthan());
            return 3;
        } else if (generetedNumber == getValue()) {
            System.out.println("Computer chosen: " + getName());
            return 2;
        } else if (generetedNumber == getIsStrongerThan().get(0)) {
            System.out.println("Computer chosen: " + getIsWeekerthan());
            return 1;
        }
        return 0;
    }

    int getValue();

    String getName();

    String getIsWeekerthan();

    String getIsStrongerthan();

    List<Integer> getIsStrongerThan();

    List<Integer> getIsWeekerThan();



}
