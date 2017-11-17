package com.kodilla.stream.word;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continetName;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String continetName) {
        this.continetName = continetName;
    }
    public void addCountry (Country country){
        countryList.add(country);
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        if (!continetName.equals(continent.continetName)) return false;
        return countryList.equals(continent.countryList);
    }

    @Override
    public int hashCode() {
        int result = continetName.hashCode();
        result = 31 * result + countryList.hashCode();
        return result;
    }
}
