package com.kodilla.good.patterns.challenges.exercise9_4.supply.suppliers;

import com.kodilla.good.patterns.challenges.exercise9_4.delivery.iDelivery;
import com.kodilla.good.patterns.challenges.exercise9_4.products.Product;
import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductDto;
import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductRequest;

public class HealthyFood implements iDelivery {
    private String supplierName="Healthy Food Shop";

    public HealthyFood() {
    }

    @Override
    public ProductDto process(ProductRequest productRequest) {
        System.out.println("Procces order product is starting in "+supplierName);

        return new ProductDto(productRequest.product,true);
    }

    @Override
    public void inform(Product product) {
        System.out.println("Mail sent to client from "+supplierName);
    }

    @Override
    public boolean checkRepository(Product product) {
        System.out.println("Checking repository in Extra Food Shop.......");
        System.out.println(product.getProductName()+" is present in "+supplierName+" repository in: "+ product.getAmountProduct() +" amount");
        return true;
    }

    @Override
    public boolean createOrder(Product product) {
        System.out.println(supplierName+" just creating your order");
        return true;
    }

}
