package com.kodilla.good.patterns.challenges.exercise9_2.exapample.data;

import java.time.LocalDateTime;

public class RentRequeset {

    public User user;
    public LocalDateTime from;
    public LocalDateTime to;

    public RentRequeset(final User user, final LocalDateTime from, final LocalDateTime to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
