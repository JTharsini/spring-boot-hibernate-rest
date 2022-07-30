package com.jeya.springboothibernate.springboothibernaterest.customer;

import com.jeya.springboothibernate.springboothibernaterest.Mapper;
import org.springframework.stereotype.Component;

@Component("customerMapper")
public class CustomerMapper implements Mapper<CustomerData, Customer>
{
  @Override
  public Customer toEntity(CustomerData customerData)
  {
    Customer customer = new Customer();
    customer.setCustomerId(customerData.getId());
    customer.setFirstName(customerData.getFirstName());
    customer.setLastName(customerData.getLastName());
    customer.setEmail(customerData.getEmail());
    return customer;
  }

  @Override
  public CustomerData toDataObject(Customer customer)
  {
    CustomerData customerData = new CustomerData();
    customerData.setId(customer.getCustomerId());
    customerData.setFirstName(customer.getFirstName());
    customerData.setLastName(customer.getLastName());
    customerData.setEmail(customer.getEmail());
    return customerData;
  }
}
