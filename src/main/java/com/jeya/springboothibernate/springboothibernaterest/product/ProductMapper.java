package com.jeya.springboothibernate.springboothibernaterest.product;

import com.jeya.springboothibernate.springboothibernaterest.Mapper;
import org.springframework.stereotype.Component;

@Component("productMapper")
public class ProductMapper implements Mapper<ProductData, Product>
{
  @Override
  public Product toEntity(ProductData productData)
  {
    Product product = new Product();
    product.setName(productData.getName());
    product.setPrice(productData.getPrice());
    return product;
  }

  @Override
  public ProductData toDataObject(Product product)
  {
    ProductData productData = new ProductData();
    productData.setId(product.getId());
    productData.setName(product.getName());
    productData.setPrice(product.getPrice());
    return productData;
  }
}
