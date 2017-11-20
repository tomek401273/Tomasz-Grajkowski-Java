package com.kodilla.rps;

import java.util.List;

public interface Data {
    default int compere(int generetedNumber) {

        if (generetedNumber == getIsWeekerThan().get(0)) {
            return 1;
        } else if (generetedNumber == getValue()) {
            return 2;
        } else if (generetedNumber == getIsStrongerThan().get(0)) {
            return 3;
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
