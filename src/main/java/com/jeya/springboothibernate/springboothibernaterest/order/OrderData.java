package com.jeya.springboothibernate.springboothibernaterest.order;

import java.util.List;

import com.jeya.springboothibernate.springboothibernaterest.customer.CustomerData;
import com.jeya.springboothibernate.springboothibernaterest.product.ProductData;

public class OrderData
{
  private List<ProductData> productDatas;
  private CustomerData customerData;
  private Long id;

  public void setId(Long id)
  {
    this.id = id;
  }

  public List<ProductData> getProductDatas()
  {
    return productDatas;
  }

  public void setProductDatas(List<ProductData> productDatas)
  {
    this.productDatas = productDatas;
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
