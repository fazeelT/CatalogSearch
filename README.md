#Catalog Search
##Introduction
We will design system that would allow searching through product catalog based on title/brand/description match with phonetic(similar sounding words) matching
##Design
###Search Strategies
* User will be able to search by specifying search filters like name, brand or no filter
* Search using no filters will show results by relevanceScore
* For search we will determine homophones and search for all keywords(user provided and homophones)

###Database DynamoDB
* If user specifies the search filter on name or brand name then we will query product catalog directly
*  If user specifies no search filter then we will use Product Search Attributes table
* On search we will only display productName and image(if available)
####Table: Products Catalog
#####Attributes
* productId(primaryKey)
* name
* brandName
* category
* description
* imageUrl
#####Indexes
######name_productId
* name(PartitionKey)
* product_id(sortKey)
######brandName_productId
* brandName(PartitionKey)
* product_id(sortKey)
####Table: Product search attributes
#####Attributes
* uid(primaryKey)
* searchTerm(not contain common words like the, a, an, and, or...)
* relevanceScore
* searchTermFilter
* productId
* productName
* imageUrl
#####Indexes
######searchTerm_relevance
* searchTerm(PartitionKey)
* relevanceScore(sortKey)

![alt text](https://raw.githubusercontent.com/fazeelT/catalogsearch/master/CatalogSearch.png)
