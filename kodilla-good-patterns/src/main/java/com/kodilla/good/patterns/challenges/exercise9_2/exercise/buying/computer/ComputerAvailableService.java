package com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.computer;

import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.AvailableService;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.Buyer;

import java.time.LocalDateTime;

public class ComputerAvailableService implements AvailableService {

    @Override
    public boolean createTransaction(Buyer buyer, LocalDateTime transactionDate, int price) {
        System.out.println("Buyer: "+buyer.getName()+" "+buyer.getSurname()+"send request to buy Computer for a price "+price+" transaction Date"+transactionDate);
        System.out.println("Checking avaiable.......");
        System.out.println("Request permitted");
        System.out.println();
        return true;
    }
}
