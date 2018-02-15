package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void simpleTest() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new AdditionCheese(pizzaOrder);
        pizzaOrder = new AdditonHam(pizzaOrder);
        pizzaOrder = new AdditonHam(pizzaOrder);
        pizzaOrder = new AdditionCheese(pizzaOrder);
        pizzaOrder = new FastDelivery(pizzaOrder);
        // When
        BigDecimal cost = pizzaOrder.getCost();
        String desc = pizzaOrder.getDescription();
        // Then
        Assert.assertEquals(new BigDecimal(75), cost);
        Assert.assertEquals("Dough and tomato sauce with cheese + additon cheese + addition ham + addition ham + additon cheese + fast delivery", desc);

    }
}
