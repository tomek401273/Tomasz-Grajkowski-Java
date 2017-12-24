package com.kodilla.patterns.strategy.social.shere;

public class TwitterPublisher implements Shere {
    @Override
    public String shere() {
        return "Publishing post by Twitter";
    }
}
