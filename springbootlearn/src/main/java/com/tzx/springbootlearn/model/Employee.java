package com.tzx.springbootlearn.model;

import lombok.Data;

@Data
public class Employee {

  public Employee() {

  }

  public Employee(Integer id, String firstName, String lastName, String email) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  private Integer id;
  private String firstName;
  private String lastName;
  private String email;

  @Override
  public String toString() {
    return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
  }
}
