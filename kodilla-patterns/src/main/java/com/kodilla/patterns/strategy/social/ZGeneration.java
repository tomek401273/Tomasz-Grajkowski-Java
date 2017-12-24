package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.shere.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(String userName) {
        super(userName);
        this.shere = new SnapchatPublisher();
    }
}
