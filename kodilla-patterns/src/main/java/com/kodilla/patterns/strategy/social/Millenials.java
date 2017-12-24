package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.shere.TwitterPublisher;

public class Millenials extends User {
    public Millenials(String userName) {
        super(userName);
        this.shere = new TwitterPublisher();
    }
}
