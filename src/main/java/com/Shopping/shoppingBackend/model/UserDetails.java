package com.Shopping.shoppingBackend.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="UserDetails")
public class UserDetails implements  Serializable
{
	 
	
	/*private int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
*/
	
	//boolean enabled;
	String role,email;
	@NotEmpty(message = "Please enter your unique Username.")
	@Size(min = 4, max = 15, message = "Your user name must be within the specified size.")
	@Id
	String username;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 4, max = 20, message = "Your password must be within the specified size.")
	String password;
	
	@NotEmpty(message = "Please enter your contact no.")
	@Size(min = 10, max = 10, message = "Your mobile number must be within the specified size.")
	String mobile;
	

	@NotEmpty(message = "Please enter your address")
	@Size(min = 5, max = 50, message = "Your address must be within the specified size.")
	String address;
	
	@NotEmpty(message = "Please enter your name")
	@Size(min = 3, max = 20, message = "Your name must be within the specified size.")
	String custname;
	
	boolean enabled;
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	
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

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	

}

