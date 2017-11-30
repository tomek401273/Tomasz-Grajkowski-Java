package com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying;

import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.Buyer;

import java.time.LocalDateTime;

public interface AvailableService {
    boolean createTransaction(Buyer buyer, LocalDateTime transactionDate, int price);
}
