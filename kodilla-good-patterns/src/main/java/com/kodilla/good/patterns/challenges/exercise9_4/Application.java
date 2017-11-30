package com.kodilla.good.patterns.challenges.exercise9_4;

import com.kodilla.good.patterns.challenges.exercise9_4.processor.Processor;
import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductRequest;
import com.kodilla.good.patterns.challenges.exercise9_4.products.ProductRequestRetriver;
import com.kodilla.good.patterns.challenges.exercise9_4.supply.suppliers.ExtraFoodShop;

public class Application {
    public static void main(String[] args) {
        ProductRequestRetriver productRequestRetriver = new ProductRequestRetriver();

        ProductRequest productRequest1 = productRequestRetriver.retrive1();
        ProductRequest productRequest2 = productRequestRetriver.retrive2();
        ProductRequest productRequest3 = productRequestRetriver.retrive3();

        Processor processor= new Processor(new ExtraFoodShop());
        processor.execuete(productRequest1);
        processor.execuete(productRequest2);
        processor.execuete(productRequest3);
    }



}
