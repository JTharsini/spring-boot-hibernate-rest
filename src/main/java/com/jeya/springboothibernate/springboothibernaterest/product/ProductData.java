package com.jeya.springboothibernate.springboothibernaterest.product;

public class ProductData
{
  private String name;
  private double price;
  private Long id;

  public void setId(Long id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public double getPrice()
  {
    return price;
  }

  public Long getId()
  {
    return id;
  }
}
