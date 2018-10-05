package com.catalogsearch.dao;

import com.catalogsearch.model.Operator;
import com.catalogsearch.model.Product;
import com.catalogsearch.model.SearchFilter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DDBProductDAO implements ProductsCatalogDAO {
    private static final Map<Operator, String> OPERATOR_TO_DYNAMO_DB_FILTER_EXPRESSION = new HashMap<>();
    static {
        OPERATOR_TO_DYNAMO_DB_FILTER_EXPRESSION.put(Operator.EQUALS, "=");
        OPERATOR_TO_DYNAMO_DB_FILTER_EXPRESSION.put(Operator.CONTAINS, "Contains");
        OPERATOR_TO_DYNAMO_DB_FILTER_EXPRESSION.put(Operator.NOT_EQUALS, "!=");
    }
    /*private final DDBClient ddbClient;*/

    @Override
    public Product getProduct(String id) {
        return null;
    }

    /**
     * Performs DynamoDB request and returns list of products.
     * @param searchFilters
     * @return
     */
    @Override
    public List<Product> getFilteredProducts(List<SearchFilter> searchFilters) {
        return null;
    }

    /**
     * Will convert the operator and attribute and value to DynamoDB specific search filter expression
     * @param searchFilter
     * @return
     */
    private String prepareDynamoDBFilterExpression(SearchFilter searchFilter) {
        return "";
    }
}
