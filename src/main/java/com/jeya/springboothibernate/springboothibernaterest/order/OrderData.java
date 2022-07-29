package com.jeya.springboothibernate.springboothibernaterest.order;

import com.jeya.springboothibernate.springboothibernaterest.customer.CustomerData;
import com.jeya.springboothibernate.springboothibernaterest.product.ProductData;

public class OrderData
{
  private ProductData productData;
  private CustomerData customerData;
  private Long id;

  public void setId(Long id)
  {
    this.id = id;
  }

  public ProductData getProductData()
  {
    return productData;
  }

  public void setProductData(ProductData productData)
  {
    this.productData = productData;
  }

  public CustomerData getCustomerData()
  {
    return customerData;
  }

  public void setCustomerData(CustomerData customerData)
  {
    this.customerData = customerData;
  }

  public Long getId()
  {
    return id;
  }
}
