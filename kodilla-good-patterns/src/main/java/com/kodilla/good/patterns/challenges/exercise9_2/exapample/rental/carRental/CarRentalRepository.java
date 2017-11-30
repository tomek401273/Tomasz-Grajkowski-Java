package com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.carRental;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.User;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.RentalRepository;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    public CarRentalRepository() {
    }


    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println(user.getName()+" "+user.getSurname()+ " has rented car from " + from + " to " + to);
        return true;
    }
}
