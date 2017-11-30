package com.kodilla.good.patterns.challenges.exercise9_4.products;

public class ProductDto {
    public Product product;
    public boolean isProduct;

    public ProductDto(final Product product, final boolean isProduct) {
        this.product = product;
        this.isProduct = isProduct;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isProduct() {
        return isProduct;
    }
}
