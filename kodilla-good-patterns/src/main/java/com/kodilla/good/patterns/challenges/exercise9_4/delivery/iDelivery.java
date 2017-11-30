package com.kodilla.good.patterns.challenges.exercise9_4.delivery;

import com.kodilla.good.patterns.challenges.exercise9_4.products.Product;
import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductDto;
import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductRequest;

public interface iDelivery {
    ProductDto process (ProductRequest productRequest);
    void inform (Product product);
    boolean checkRepository(Product product);
    boolean createOrder(Product product);
}
