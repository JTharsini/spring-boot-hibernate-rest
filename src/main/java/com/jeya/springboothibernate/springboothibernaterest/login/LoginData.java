package com.jeya.springboothibernate.springboothibernaterest.login;

import com.jeya.springboothibernate.springboothibernaterest.customer.Customer;

public class LoginData
{
  private Customer customer;
  private String username;
  private String password;

  public Customer getCustomer()
  {
    return customer;
  }

  public void setCustomer(Customer customer)
  {
    this.customer = customer;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }
}
