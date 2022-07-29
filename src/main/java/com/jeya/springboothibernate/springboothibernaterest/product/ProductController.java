package com.jeya.springboothibernate.springboothibernaterest.product;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController
{
  @Resource(name = "productService")
  private ProductService productService;

  @GetMapping
  public List<ProductData> getProducts()
  {
    return productService.getAllProducts();
  }

  @GetMapping("/product/{id}")
  public ProductData getProduct(@PathVariable Long id)
  {
    return productService.getProductById(id);
  }

  @PostMapping("/product")
  public ProductData saveProduct(final @RequestBody ProductData customerData)
  {
    return productService.saveProduct(customerData);
  }

  @DeleteMapping("/product/{id}")
  public Boolean deleteProduct(@PathVariable Long id)
  {
    return productService.deleteProduct(id);
  }
}
