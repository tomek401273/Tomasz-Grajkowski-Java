package com.kodilla.good.patterns.challenges.exercise9_4.products;

import com.kodilla.good.patterns.challenges.exercise9_4.delivery.iDelivery;

public class ProductRequest {
    public Product product;
    public String supplier;
    iDelivery delivery;

    public ProductRequest(final Product product,final String supplier, final iDelivery delivery) {
        this.product = product;
        this.supplier = supplier;
        this.delivery = delivery;
    }

    public Product getProduct() {
        return product;
    }

    public String getSupplier() {
        return supplier;
    }

    public iDelivery getDelivery() {
        return delivery;
    }
}
