package com.generics.dynamiconlinemarketplace;
abstract class ProductCategory {
    private String category;

    public ProductCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
