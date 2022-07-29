package com.jeya.springboothibernate.springboothibernaterest.product;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class DefaultProductService implements ProductService
{
  @Autowired
  private ProductRepository productRepository;
  @Autowired
  private ProductMapper productMapper;

  @Override
  public ProductData saveProduct(ProductData productData)
  {
    Product product = productMapper.toEntity(productData);
    return productMapper.toDataObject(productRepository.save(product));
  }

  @Override
  public boolean deleteProduct(Long productId)
  {
    productRepository.deleteById(productId);
    return true;
  }

  @Override
  public List<ProductData> getAllProducts()
  {
    List<ProductData> productDataList = new ArrayList<>();
    List<Product> productList = productRepository.findAll();
    productList.forEach(product -> {
      productDataList.add(productMapper.toDataObject(product));
    });
    return productDataList;
  }

  @Override
  public ProductData getProductById(Long productId)
  {
    return productMapper.toDataObject(productRepository.findById(productId)
                                        .orElseThrow(() -> new EntityNotFoundException("Product not found")));
  }
}
