package com.kodilla.stream.word;

import java.math.BigDecimal;

public class Country {
    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (!name.equals(country.name)) return false;
        return peopleQuantity.equals(country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + peopleQuantity.hashCode();
        return result;
    }
}
