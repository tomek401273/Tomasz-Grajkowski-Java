package com.kodilla.stream.world;

import com.kodilla.stream.word.Continent;
import com.kodilla.stream.word.Country;
import com.kodilla.stream.word.Word;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeoplequantity() {
        Word word = new Word("Earth");
        Continent Europe = new Continent("Europe");
        Continent America = new Continent("America");


        BigDecimal countPeoplePoland= new BigDecimal("121222211111111111111");
        BigDecimal countPeopleGerman = new BigDecimal("23323232323232323232");
        BigDecimal countPeopleFrance = new BigDecimal("132358363287623787823");

        BigDecimal countPeopleUSA = new BigDecimal("1236673284628468238234686");
        BigDecimal countPeopleCandada = new BigDecimal("236223648937349889732");
        BigDecimal countPeopleMexico = new BigDecimal("3323773737373737337373");

        Country Poland = new Country("poland", countPeoplePoland);
        Country German = new Country("German", countPeopleGerman);
        Country France = new Country("France", countPeopleFrance);

        Country USA = new Country("USA", countPeopleUSA);
        Country Candada = new Country("Canda", countPeopleCandada);
        Country Mexico = new Country("Mexico", countPeopleMexico);

        Europe.addCountry(Poland);
        Europe.addCountry(German);
        Europe.addCountry(France);

        America.addCountry(USA);
        America.addCountry(Candada);
        America.addCountry(Mexico);

        word.addContinent(Europe);
        word.addContinent(America);

        BigDecimal totalCountPeople = word.getPeopleQuantity();
        BigDecimal expectedCountPeople = new BigDecimal("1240510185821501292683957");

        Assert.assertEquals(expectedCountPeople, totalCountPeople);

    }
}
