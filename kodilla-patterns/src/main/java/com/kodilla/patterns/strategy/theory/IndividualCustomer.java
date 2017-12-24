package com.kodilla.patterns.strategy.theory;

import com.kodilla.patterns.strategy.theory.predictor.ConservativePredictor;

public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
