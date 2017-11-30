package com.kodilla.good.patterns.challenges.exercise9_2.exapample.data;

import java.time.LocalDateTime;

public class RentalRequestRetriver {
    public RentRequeset retrive() {
        User user = new User("John","Wekl");
        LocalDateTime retntFrom = LocalDateTime.of(2017, 8,1,12,0);
        LocalDateTime retntTo = LocalDateTime.of(2017, 9,1,12,0);
        return new RentRequeset(user, retntFrom, retntTo);
    }

}
