package com.apex.user.entity;

import javax.persistence.*;

@Entity
@Table(name="'usr'")
public class User {

private int id;
private String firstName;
private String lastName;
private String middleName;
public User() {
	super();
}
@Id
@Column(name="userid")
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="firstname")
public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}
@Column(name="lastname")
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Column(name="middlename")
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}



















}
