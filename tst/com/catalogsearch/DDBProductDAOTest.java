package com.catalogsearch;

import com.catalogsearch.dao.DDBProductDAO;
import com.catalogsearch.model.Operator;
import com.catalogsearch.model.Product;
import com.catalogsearch.model.ProductSearchAttributes;
import com.catalogsearch.model.SearchFilter;

import java.util.Arrays;
import java.util.List;

/*@RunWith(MockitoJunitRunner.class)*/
public class DDBProductDAOTest {
    private DDBProductDAO ddbProductDAO;

    /*@Mock*/
    /*private DDBClient ddbClient;*/

    /*@Before*/
    public void setup() {
        /*when(ddbClient.queryPage(eq(ProductSearchAttributes.class), any(DynamoDBQueryExpression.class))).thenReturn(Arrays.asList(new Product()));*/
    }

    /*@Test*/
    public void test_ddb_returns_products() {
        final List<Product> productList = ddbProductDAO.getFilteredProducts(Arrays.asList(new SearchFilter("name", "Churritos", Operator.EQUALS)));
        /*assertFalse(productList.isEmpty());*/
        /*assertTrue(CollectionUtils.contains(expectedListOfProducts, productList));*/
    }
}
