package com.kodilla.patterns.strategy.theory;

import com.kodilla.patterns.strategy.theory.predictor.BalancePredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancePredictor();
    }
}
