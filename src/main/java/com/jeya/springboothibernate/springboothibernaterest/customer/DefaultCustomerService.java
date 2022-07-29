package com.jeya.springboothibernate.springboothibernaterest.customer;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class DefaultCustomerService implements CustomerService
{
  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
  private CustomerMapper customerMapper;

  /**
   * Create a customer based on the data sent to the service class.
   * @param customer
   * @return DTO representation of the customer
   */
  @Override
  public CustomerData saveCustomer(CustomerData customer)
  {
    Customer customerModel = customerMapper.toEntity(customer);
    return customerMapper.toDataObject(customerRepository.save(customerModel));
  }

  /**
   * Delete customer based on the customer ID.We can also use other option to delete customer
   * based on the entity (passing JPA entity class as method parameter)
   * @param customerId
   * @return boolean flag showing the request status
   */
  @Override
  public boolean deleteCustomer(Long customerId)
  {
    customerRepository.deleteById(customerId);
    return true;
  }

  /**
   * return the list of all the customers in the system.
   * use pagination in the real world example.
   * @return list of customer
   */
  @Override
  public List<CustomerData> getAllCustomers()
  {
    List<CustomerData> customers = new ArrayList<>();
    List<Customer> customerList = customerRepository.findAll();
    customerList.forEach(customer -> {
      customers.add(customerMapper.toDataObject(customer));
    });
    return customers;
  }

  /**
   * Get customer by ID. The service will send the customer data else will throw the exception.
   * @param customerId
   * @return CustomerData
   */
  @Override
  public CustomerData getCustomerById(Long customerId)
  {
    return customerMapper.toDataObject(customerRepository.findById(customerId)
                                         .orElseThrow(() -> new EntityNotFoundException("Customer not found")));
  }
}
