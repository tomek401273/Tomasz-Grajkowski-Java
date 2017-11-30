package com.kodilla.good.patterns.challenges.exercise9_4.products;

import com.kodilla.good.patterns.challenges.exercise9_4.supply.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.exercise9_4.supply.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.exercise9_4.supply.suppliers.HealthyFood;

public class ProductRequestRetriver {

    public ProductRequest retrive1() {
        Product product1 = new Product("Cornflakes", 1);
        String supplier = "ExtraFoodShop";
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        return new ProductRequest(product1,supplier,extraFoodShop);
    }
    public ProductRequest retrive2() {
        Product product1 = new Product("Oatmeal", 2);
        String supplier = "GlutenFreeShop";
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        return new ProductRequest(product1,supplier,glutenFreeShop);
    }
    public ProductRequest retrive3() {
        Product product1 = new Product("Salmon", 3);
        String supplier = "HealthyFood";
        HealthyFood healthyFood = new HealthyFood();
        return new ProductRequest(product1,supplier,healthyFood);
    }

}

