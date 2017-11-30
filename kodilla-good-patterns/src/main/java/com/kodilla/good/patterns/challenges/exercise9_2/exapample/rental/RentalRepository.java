package com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.User;

import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
