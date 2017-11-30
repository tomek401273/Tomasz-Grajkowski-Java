package com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.carRental;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.User;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.RentalService;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("'Rental Service' User: " + user.getName()+ user.getSurname()+" send request to renal our Car from " + from + " to: " + to);
        System.out.println("Checkig requser .....");
        System.out.println("Requset permitted ");
        System.out.println();
        return true;
    }
}
