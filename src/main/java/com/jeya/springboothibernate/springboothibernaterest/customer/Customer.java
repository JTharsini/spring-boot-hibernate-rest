package com.jeya.springboothibernate.springboothibernaterest.customer;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.jeya.springboothibernate.springboothibernaterest.login.Login;
import com.jeya.springboothibernate.springboothibernaterest.order.Order;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer implements Serializable
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customerId")
  private Long customerId;
  private String firstName;
  private String lastName;
  private String email;

  @OneToOne
  @JoinColumn(name = "id")
  @PrimaryKeyJoinColumn
  private Login login;

  @OneToMany(fetch = FetchType.LAZY)// by default optional = true
  @JoinColumn(name = "orderId")// by default nullable = true
  private List<Order> orders; // it's not mandatory to have this just because ManyToOne for order is there

  public List<Order> getOrders()
  {
    return orders;
  }

  public void setOrders(List<Order> orders)
  {
    this.orders = orders;
  }

  public Customer()
  {
  }

  public Long getCustomerId()
  {
    return customerId;
  }

  public void setCustomerId(Long customerId)
  {
    this.customerId = customerId;
  }

  public Login getLogin()
  {
    return login;
  }

  public void setLogin(Login login)
  {
    this.login = login;
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
