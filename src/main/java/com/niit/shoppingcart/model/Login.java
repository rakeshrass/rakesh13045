package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Table(name="login")
@Component
public class Login {

@Id
private int id;
private String username;
private String password;
private String role="ROLE_USER";
private boolean status=true;
/*Getter and setter methods are used to retrieve and manipulate private variables in a different class. 
A "getter" method does as it name suggest, retrieves a the attribute of the same name. 
A setter method allows you to set the value of the attribute.
*/
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}


}

