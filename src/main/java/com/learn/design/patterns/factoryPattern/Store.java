package com.learn.design.patterns.factoryPattern;

/**
 * Abstract Store
 */
public interface Store {
    /**
     * Creates the product based on the {@link ProductType}
     * @param productType the {@link ProductType}
     * @return an instance of {@link Product}
     */
    Product createProduct(ProductType productType);
}
