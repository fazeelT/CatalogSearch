package com.catalogsearch.model;

public enum ProductCategory {
    SNACKS("Snacks");

    private final String categoryName;

    ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }
}
