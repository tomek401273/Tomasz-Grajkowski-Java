package com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.computer;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.User;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.BuyingRepository;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.Buyer;

import java.time.LocalDateTime;

public class ComputerButingRepository implements BuyingRepository {

    @Override
    public boolean createSale(Buyer buyer, LocalDateTime transactionDate, int price) {
        System.out.println(buyer.getName() + " " + buyer.getSurname() + " was bought computer in price " + price + " TransactionDate " + transactionDate);
        return true;
    }
}
