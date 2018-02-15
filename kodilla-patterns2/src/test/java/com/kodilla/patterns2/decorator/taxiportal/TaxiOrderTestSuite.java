package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;
public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testNetworkGetDescription() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        // When
       String desription = theOrder.getDescription();
       assertEquals("Drive a course by Taxi Network", desription);
    }

    @Test
    public void testMyTaxiDriverWithChildSeatGetCostAndDesc() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        String desription = theOrder.getDescription();
        assertEquals(new BigDecimal(37), theCost);
        assertEquals("Drive a course by MyTaxi Network + child seat", desription);
    }

    @Test
    public void testMyTaxiDriverWithDoubeChildSeatGetCostAndDesc() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        // When
        BigDecimal theCost = theOrder.getCost();
        String desription = theOrder.getDescription();
        assertEquals(new BigDecimal(39), theCost);
        assertEquals("Drive a course by MyTaxi Network + child seat + child seat", desription);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCostAndDesc() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println("cost: "+theOrder.getCost() +"desc: "+theOrder.getDescription());
        // When
        BigDecimal theCost = theOrder.getCost();
        String desc = theOrder.getDescription();

        assertEquals(new BigDecimal(52), theCost);
        assertEquals("Drive a course by Taxi Network variant VIP + child seat", desc);
    }
}
