package com.catalogsearch.model;

public class SearchFilter {
    private final String attributeName;
    private final String attributeValue;
    private final Operator operator;

    public SearchFilter(String attributeName, String attributeValue, Operator operator) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
        this.operator = operator;
    }
}
