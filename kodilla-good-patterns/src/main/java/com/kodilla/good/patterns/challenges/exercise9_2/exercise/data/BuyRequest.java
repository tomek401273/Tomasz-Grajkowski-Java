package com.kodilla.good.patterns.challenges.exercise9_2.exercise.data;

import java.time.LocalDateTime;

public class BuyRequest {
    public Buyer buyer;
    public LocalDateTime transactionDate;
    public int price;

    public BuyRequest(final Buyer buyer,final LocalDateTime transactionDate,final int price) {
        this.buyer = buyer;
        this.transactionDate = transactionDate;
        this.price = price;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public int getPrice() {
        return price;
    }
}
