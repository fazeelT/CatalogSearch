package com.catalogsearch;

import com.catalogsearch.dao.DDBProductDAO;
import com.catalogsearch.dao.ProductsCatalogDAO;
import com.catalogsearch.model.Operator;
import com.catalogsearch.model.Product;
import com.catalogsearch.model.SearchFilter;
import com.catalogsearch.search.LevenshteinDistanceKeyWordBuilder;
import com.catalogsearch.search.PhoneticKeywordsBuilder;
import com.catalogsearch.search.SearchKeywordsBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {
    private static final String SPACE_CHARACTER = " ";
    private final List<SearchKeywordsBuilder> keywordsBuilders;
    private final ProductsCatalogDAO productsCatalogDAO;

    public Application() {
        final SearchKeywordsBuilder levenshteinDistanceKeyWordBuilder = new LevenshteinDistanceKeyWordBuilder();
        final SearchKeywordsBuilder phoneticKeywordsBuilder = new PhoneticKeywordsBuilder();


        keywordsBuilders = Arrays.asList(levenshteinDistanceKeyWordBuilder, phoneticKeywordsBuilder);

        productsCatalogDAO = new DDBProductDAO();

    }

    public List<Product> searchForProducts(String searchString) {
        final List<SearchFilter> searchFilters = convertSearchStringToSearchFilters(searchString);

        return productsCatalogDAO.getFilteredProducts(searchFilters);
    }

    private List<SearchFilter> convertSearchStringToSearchFilters(String searchString) {
        /*if search String is just keywords no filter*/
        List<String> keywords = Arrays.asList(searchString.split(SPACE_CHARACTER));
        final List<String> searchKeywords = keywords.stream()
                .flatMap(kw -> this.getKeywords(kw).stream())
                .distinct()
                .collect(Collectors.toList());

        return searchKeywords.stream()
                .map(kw -> new SearchFilter("searchTerm", kw, Operator.EQUALS))
                .collect(Collectors.toList());

        /*if search string contain filters... then we will write parser to convert search string to list of searchfilter*/
    }

    private List<String> getKeywords(String keyword) {
        return keywordsBuilders.stream()
                .flatMap(kb -> kb.getKeyWords(keyword).stream())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        final Application application = new Application();

        application.searchForProducts("Churritos");
    }
}
