package com.jeya.springboothibernate.springboothibernaterest.customer;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  @Column(updatable = false, nullable = false)
  @CreatedDate
  private LocalDateTime createdTime;
  @Column(nullable = false)
  @LastModifiedDate
  private LocalDateTime updatedTime;

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

  public LocalDateTime getCreatedTime()
  {
    return createdTime;
  }

  public void setCreatedTime(LocalDateTime createdTime)
  {
    this.createdTime = createdTime;
  }

  public LocalDateTime getUpdatedTime()
  {
    return updatedTime;
  }

  public void setUpdatedTime(LocalDateTime updatedTime)
  {
    this.updatedTime = updatedTime;
  }
}
