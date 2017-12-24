package com.kodilla.patterns.strategy.social.shere;

public class SnapchatPublisher implements Shere {
    @Override
    public String shere() {
        return "Publishing post by Snapchat";
    }
}
