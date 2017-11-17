package com.kodilla.stream.word;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal PeopleQuantity;

    public Country(final BigDecimal peopleQuantity) {
        PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }
}
