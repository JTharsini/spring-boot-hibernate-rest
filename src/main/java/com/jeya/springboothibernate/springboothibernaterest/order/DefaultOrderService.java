package com.jeya.springboothibernate.springboothibernaterest.order;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class DefaultOrderService implements OrderService
{
  @Autowired
  private OrderRepository orderRepository;
  @Autowired
  private OrderMapper orderMapper;

  @Override
  public OrderData saveOrder(OrderData orderData)
  {
    Order order = orderMapper.toEntity(orderData);
    return orderMapper.toDataObject(orderRepository.save(order));
  }

  @Override
  public boolean deleteOrder(Long orderId)
  {
    orderRepository.deleteById(orderId);
    return true;
  }

  @Override
  public List<OrderData> getAllOrders()
  {
    List<OrderData> orderDataList = new ArrayList<>();
    List<Order> orderList = orderRepository.findAll();
    orderList.forEach(order -> {
      orderDataList.add(orderMapper.toDataObject(order));
    });
    return orderDataList;
  }

  @Override
  public OrderData getOrderById(Long orderId)
  {
    return orderMapper.toDataObject(orderRepository.findById(orderId)
                                      .orElseThrow(() -> new EntityNotFoundException("Order not found")));
  }
}
