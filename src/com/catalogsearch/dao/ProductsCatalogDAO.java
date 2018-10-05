package com.catalogsearch.dao;

import com.catalogsearch.model.Product;
import com.catalogsearch.model.SearchFilter;

import java.util.List;

public interface ProductsCatalogDAO {
    Product getProduct(String id);
    List<Product> getFilteredProducts(List<SearchFilter> searchFilters);
}
