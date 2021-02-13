package com.learn.design.patterns.factoryPattern;

/**
 * This is a product the sample store creates.
 */
class ProductType1 implements Product {

    @Override
    public void run() {
        System.out.println("This is  product of type 1");
    }
}
