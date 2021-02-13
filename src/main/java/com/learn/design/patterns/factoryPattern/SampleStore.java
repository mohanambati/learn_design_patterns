package com.learn.design.patterns.factoryPattern;

/**
 * This is a franchise of {@link Store}
 */
public class SampleStore implements Store {
    @Override
    public Product createProduct(final ProductType productType) {
        final Product product = ProductFactory.create(productType);
        return product;
    }
}
