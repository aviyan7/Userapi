package com.aadiminnovation.user.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userDetails")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue
  private int id;
  private String name;
  private String email;
  
  public User() {
	  super();
  }
  
  
public User(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

  
}