package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Asia implements SadStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("98765432101234567890");
        return sandQuantity;
    }
}
