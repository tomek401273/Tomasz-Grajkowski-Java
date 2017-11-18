package com.kodilla.rps;

public interface Data {
    default int compere(int generetedNumber) {

        System.out.println("you chose:" +getName());
        if(generetedNumber==getIsWeekerThan()){
            System.out.println("you win!!!");
            System.out.println("Computer chosen: "+getIsStrongerthan());
            return 1;
        }
        else if(generetedNumber==getValue()){
            System.out.println("Remis");
            System.out.println("Computer chosen: "+getName());
        }
        else if (generetedNumber==getIsStrongerThan()){
            System.out.println("You lose !!!");
            System.out.println("Computer chosen: "+getIsWeekerthan());
        }
        return 0;
    }

     String getIsWeekerthan();

     int getIsStrongerThan();

     int getValue();

     String getIsStrongerthan();

     int getIsWeekerThan();

    String getName();

}
