package com.kodilla.good.patterns.challenges.exercise9_4.products;

public class Product {
    private String productName;
    private int amountProduct;

    public Product( String productName, int amountProduct) {
        this.productName = productName;
        this.amountProduct = amountProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmountProduct() {
        return amountProduct;
    }
}
