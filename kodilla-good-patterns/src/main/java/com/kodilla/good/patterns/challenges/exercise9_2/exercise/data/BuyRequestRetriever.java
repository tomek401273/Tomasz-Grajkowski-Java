package com.kodilla.good.patterns.challenges.exercise9_2.exercise.data;

import java.time.LocalDateTime;

public class BuyRequestRetriever {
    public BuyRequest retrive() {
        Buyer buyer = new Buyer("Tom","Thomas","Thorun");
        LocalDateTime transactionDate = LocalDateTime.of(2017,11, 30, 12,30,0);
        int price = 10000;
        return new BuyRequest(buyer,transactionDate,price);
    }
}
