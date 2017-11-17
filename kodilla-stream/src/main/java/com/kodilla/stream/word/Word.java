package com.kodilla.stream.word;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Word {
    private final List<Continent> continentList = new ArrayList<>();
    private final String name;

    public Word(String name) {
        this.name = name;
    }
    public void  addContinent(Continent continent){
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
BigDecimal countPeople = continentList.stream()
               .flatMap(continent -> continent.getCountryList().stream())
               .map(Country::getPeopleQuantity)
               .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));

        return countPeople;
    }
}
