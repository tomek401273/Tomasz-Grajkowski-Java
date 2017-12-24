package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.shere.Shere;

public class User {
    final private String userName;
    protected Shere shere;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public Shere getShere() {
        return shere;
    }

    public void setShere(Shere shere) {
        this.shere = shere;
    }
    public String sherePost() {
        return shere.shere();
    }
}
