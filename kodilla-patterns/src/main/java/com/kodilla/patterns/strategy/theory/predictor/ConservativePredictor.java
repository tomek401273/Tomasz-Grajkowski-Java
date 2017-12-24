package com.kodilla.patterns.strategy.theory.predictor;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
       return  "[Conservative predictor] Buy debentures of XYZ";
    }
}
