package com.kodilla.patterns.strategy.theory;

import com.kodilla.patterns.strategy.theory.predictor.BuyPredictor;

public class Customer {
    final private String name;
    protected BuyPredictor buyPredictor;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }
    public void setBuyPredictor(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }

}
