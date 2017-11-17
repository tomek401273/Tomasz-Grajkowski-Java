package com.kodilla.stream.word;

import java.math.BigDecimal;

public class Country {
    private final String name;
    private final BigDecimal PeopleQuantity;

    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (!name.equals(country.name)) return false;
        return PeopleQuantity.equals(country.PeopleQuantity);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + PeopleQuantity.hashCode();
        return result;
    }
}
