package com.learn.design.patterns.factoryPattern;

/**
 * ProductFactory creates products using Factory pattern.
 */
class ProductFactory {

    /**
     * No-Op product when uer specifies product that isn't available.
     */
    static class No_Op_Product implements Product{
        @Override
        public void run() {
            System.out.println("This is a no-op product;");
        }
    }

    /**
     * Create the {@link Product}
     * @param productType the {@link ProductType}
     * @return a {@link Product}
     */
    public static Product create(final ProductType productType) {
        switch (productType) {
            case TYPE1:
                return new ProductType1();
            case TYPE2:
                return new ProductType2();
            default:
                return new No_Op_Product();
        }
    }

}
