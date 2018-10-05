package com.catalogsearch.model;

//@DynamoDBTable(tableName="ProductSearchAttributes")
public class ProductSearchAttributes {
    private final String uid;
    private final String searchTerm;
    private final double relevanceScore;
    private final String productId;
    private final String productName;
    private final String imageUrl;

    public ProductSearchAttributes(String uid, String searchTerm, double relevanceScore, String productId,
                                   String productName, String imageUrl) {
        this.uid = uid;
        this.searchTerm = searchTerm;
        this.relevanceScore = relevanceScore;
        this.productId = productId;
        this.productName = productName;
        this.imageUrl = imageUrl;
    }

    /*Getters only*/
}
