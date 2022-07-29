package com.jeya.springboothibernate.springboothibernaterest.customer;

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
@RequestMapping("/customers")
public class CustomerController
{
  @Resource(name = "customerService")
  private CustomerService customerService;

  /**
   * <p>Get all customer data in the system.For production use
   * pagination.</p>
   * @return List<CustomerData>
   */
  @GetMapping
  public List<CustomerData> getCustomers()
  {
    return customerService.getAllCustomers();
  }

  /**
   * get the customer data based on the ID.
   * @param id
   * @return CustomerData
   */
  @GetMapping("/customer/{id}")
  public CustomerData getCustomer(@PathVariable Long id)
  {
    return customerService.getCustomerById(id);
  }

  /**
   * Post request to create customer information int the system.
   * @param customerData
   * @return
   */
  @PostMapping("/customer")
  public CustomerData saveCustomer(final @RequestBody CustomerData customerData)
  {
    return customerService.saveCustomer(customerData);
  }

  /**
   * <p>Delete customer from the system based on the ID. The method mapping is like the getCustomer with difference of
   * @DeleteMapping and @GetMapping</p>
   * @param id
   * @return
   */
  @DeleteMapping("/customer/{id}")
  public Boolean deleteCustomer(@PathVariable Long id)
  {
    return customerService.deleteCustomer(id);
  }
}
