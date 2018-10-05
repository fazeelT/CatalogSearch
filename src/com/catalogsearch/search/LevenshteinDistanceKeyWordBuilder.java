package com.catalogsearch.search;

import java.util.ArrayList;
import java.util.List;

public class LevenshteinDistanceKeyWordBuilder implements SearchKeywordsBuilder {
    private static final Integer LEVENSHTEIN_DISTANCE_THRESHOLD = 2;

    /**
     * Will have to calculate Levenshtein distance for the keyword and return keywords within the threshold of given keyword.
     * <p>
     *     Note: This keywords inference is not good as it may return irrelevant keywords for given search keyword
     * </p>
     * @param keyword
     * @return
     */
    @Override
    public List<String> getKeyWords(String keyword) {
        return new ArrayList<String>();
    }
}
