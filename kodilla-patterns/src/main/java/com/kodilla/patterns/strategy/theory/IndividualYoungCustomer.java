package com.kodilla.patterns.strategy.theory;

import com.kodilla.patterns.strategy.theory.predictor.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
