package com.kodilla.good.patterns.challenges.exercise9_4.processor;

import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductDto;
import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductRequest;
import com.kodilla.good.patterns.challenges.exercise9_4.delivery.iDelivery;

public class Processor  {
    private iDelivery delivery;

    public Processor(iDelivery delivery) {
        this.delivery = delivery;
    }
    public ProductDto execuete(ProductRequest productRequest){
        boolean checkRepository = delivery.checkRepository(productRequest.product);
        if(checkRepository){
            boolean createOrder = delivery.createOrder(productRequest.product);
            if (checkRepository){
                System.out.println("You order was created successfully. \nDelivery will by soon");
                System.out.println();
                return new ProductDto(productRequest.getProduct(),true);
            }
            else {
                System.out.println("Ordering in progress");
                return new ProductDto(productRequest.getProduct(),false);
            }
        }
        else {
            System.out.println("Ordering product:"+productRequest.product.getProductName()+"in amount: "+productRequest.product.getAmountProduct()+"is not avaiable now");
            return new ProductDto(productRequest.getProduct(),false);
        }
    }
}
