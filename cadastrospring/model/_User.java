package com.app.cadastrospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class _User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String emailId;
  private String name;
  private String lastName;
  

  private String password;
  private String cpassword;

  public _User() {}

  public _User(
    int id,
    String emailId,
    String name,
    String password,
    String cpassword
  ) {
    super();
    this.id = id;
    this.emailId = emailId;
    this.name = name;
    this.password = password;
    this.cpassword = cpassword;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCpassword() {
    return cpassword;
  }

  public void setCpassword(String cpassword) {
    this.cpassword = cpassword;
  }
}
