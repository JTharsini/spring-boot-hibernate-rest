package com.jeya.springboothibernate.springboothibernaterest.product;

import java.util.List;

public interface ProductService
{
  ProductData saveProduct(ProductData productData);

  boolean deleteProduct(Long productId);

  List<ProductData> getAllProducts();

  ProductData getProductById(Long productId);
}
