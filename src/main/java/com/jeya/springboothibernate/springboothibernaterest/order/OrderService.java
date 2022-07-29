package com.jeya.springboothibernate.springboothibernaterest.order;

import java.util.List;

public interface OrderService
{
  OrderData saveOrder(OrderData orderData);

  boolean deleteOrder(Long orderId);

  List<OrderData> getAllOrders();

  OrderData getOrderById(Long orderId);
}
