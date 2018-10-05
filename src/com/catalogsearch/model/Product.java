package com.catalogsearch.model;


//@DynamoDBTable(tableName="ProductsCatalog")
public class Product {
    private final String id;
    private final String name;
    private final String brandName;
    private final String description;
    private final ProductCategory productCategory;
    private final String imageUrl;

    public Product(/*@Nonnull*/ String id, /*@Nonnull*/ String name, /*@Nonnull*/ String brandName, /*@Nonnull*/String description,
            /*@Nonnull*/ ProductCategory productCategory, /*@Nonnull*/ String imageUrl) {
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.description = description;
        this.productCategory = productCategory;
        this.imageUrl = imageUrl;
    }

    /*Getters only*/
}
