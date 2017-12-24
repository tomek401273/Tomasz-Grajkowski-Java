package com.kodilla.patterns.strategy.social.shere;

public class FacebookPublisher implements Shere{
    @Override
    public String shere() {
        return "Publishing post by Facebook";
    }
}
