package com.learn.design.patterns;

import com.learn.design.patterns.factoryPattern.Product;
import com.learn.design.patterns.factoryPattern.ProductType;
import com.learn.design.patterns.factoryPattern.SampleStore;
import com.learn.design.patterns.factoryPattern.Store;

/**
 * This class consumes factory pattern.
 */
public class FactoryPatternApplication {

    /**
     * End-point for factory pattern
     * @param args command line arguments
     */
    public static void main(final String args[]) {
        // Go to the store you wish(in this scenario we have only one store - SampleStore)
        final Store mySTore = new SampleStore();
        //Order to create a product of type1
        final Product product1 = mySTore.createProduct(ProductType.TYPE1);
        product1.run();
        // Order to create a product of type2
        final Product product2 = mySTore.createProduct(ProductType.TYPE2);
        product2.run();
    }
}
