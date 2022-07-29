package com.jeya.springboothibernate.springboothibernaterest.customer;

import java.util.List;

public interface CustomerService
{
  CustomerData saveCustomer(CustomerData customer);

  boolean deleteCustomer(Long customerId);

  List< CustomerData > getAllCustomers();

  CustomerData getCustomerById(Long customerId);
}
