package com.jeya.springboothibernate.springboothibernaterest.order;

import com.jeya.springboothibernate.springboothibernaterest.Mapper;
import com.jeya.springboothibernate.springboothibernaterest.customer.CustomerMapper;
import com.jeya.springboothibernate.springboothibernaterest.product.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("orderMapper")
public class OrderMapper implements Mapper<OrderData, Order>
{
  @Autowired
  private CustomerMapper customerMapper;
  @Autowired
  private ProductMapper productMapper;

  @Override
  public Order toEntity(OrderData orderData)
  {
    Order order = new Order();
    order.setId(orderData.getId());
    order.setCustomer(customerMapper.toEntity(orderData.getCustomerData()));
    order.setProduct(productMapper.toEntity(orderData.getProductData()));
    return order;
  }

  @Override
  public OrderData toDataObject(Order order)
  {
    OrderData orderData = new OrderData();
    orderData.setId(order.getId());
    orderData.setCustomerData(customerMapper.toDataObject(order.getCustomer()));
    orderData.setProductData(productMapper.toDataObject(order.getProduct()));
    return orderData;
  }
}
