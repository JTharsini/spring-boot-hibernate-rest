package com.jeya.springboothibernate.springboothibernaterest.order;

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
@RequestMapping("/orders")
public class OrderController
{
  @Resource(name = "orderService")
  private OrderService orderService;

  @GetMapping
  public List<OrderData> getOrders()
  {
    return orderService.getAllOrders();
  }

  @GetMapping("/order/{id}")
  public OrderData getOrder(@PathVariable Long id)
  {
    return orderService.getOrderById(id);
  }

  @PostMapping("/order")
  public OrderData saveOrder(final @RequestBody OrderData orderData)
  {
    return orderService.saveOrder(orderData);
  }

  @DeleteMapping("/order/{id}")
  public Boolean deleteOrder(@PathVariable Long id)
  {
    return orderService.deleteOrder(id);
  }
}
