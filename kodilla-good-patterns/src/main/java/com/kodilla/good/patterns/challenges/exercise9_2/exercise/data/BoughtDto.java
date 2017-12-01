package com.kodilla.good.patterns.challenges.exercise9_2.exercise.data;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.User;

public class BoughtDto {
    private Buyer buyer;
    private boolean isBought;

    public BoughtDto(final Buyer buyer, final boolean isBought) {
        this.buyer = buyer;
        this.isBought = isBought;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isBought() {
        return isBought;
    }
}
