package com.jeya.springboothibernate.springboothibernaterest.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customerId")
  private Long id;
  private String firstName;
  private String lastName;
  private String email;

  //@OneToMany(fetch = FetchType.LAZY)// by default optional = true
  //@JoinColumn(name = "orderId")// by default nullable = true
  //private List<Order> orders;

  /**
  public List<Order> getOrders()
  {
    return orders;
  }

  public void setOrders(List<Order> orders)
  {
    this.orders = orders;
  }*/

  public Customer()
  {
  }

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }
}
