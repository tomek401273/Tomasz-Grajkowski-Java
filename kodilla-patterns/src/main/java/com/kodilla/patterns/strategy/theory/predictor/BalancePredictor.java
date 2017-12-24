package com.kodilla.patterns.strategy.theory.predictor;

public class BalancePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}
