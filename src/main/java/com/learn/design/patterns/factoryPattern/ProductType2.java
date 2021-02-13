package com.learn.design.patterns.factoryPattern;

/**
 * This a product the sample store creates.
 */
class ProductType2 implements Product {

    @Override
    public void run() {
        System.out.println("This is a product of type 2");
    }
}
