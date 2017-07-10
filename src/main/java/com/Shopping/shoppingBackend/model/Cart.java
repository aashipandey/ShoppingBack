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
@Table(name="Cart")
public class Cart implements Serializable
{
	@Id
	//@GeneratedValue
	int citemid;

	
	String status;
	

	@NotEmpty(message = "Please enter your username.")
	@Size(min = 5, max = 25, message = "Your user name must be within the specified size.")
	String username;
	

	@NotEmpty(message = "Please enter your product name.")
	@Size(min = 15, max = 25, message = "Your product name must be within the specified size.")
	String prodname;
	
	@NotEmpty(message = "Please enter price.")
	@Size(min = 2, message = "Your price must be within the specified size.")
	int price;
	
	@NotEmpty(message = "Please enter quantity.")
	@Size(min = 1, message = "Your quantity must be within the specified size.")
	int quantity;
	
	@NotEmpty(message = "Please enter cart id.")
	@Size(min = 1, max=5, message = "Your cart id must be within the specified size.")
	int cartid;
	
	@NotEmpty(message = "Please enter product id.")
	@Size(min = 1, max=5, message = "Your product id must be within the specified size.")
	int prodid;
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getcitemid() {
		return citemid;
	}
	public void setcitemid(int citemid) {
		this.citemid = citemid;
	}
	public int getProductid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
}

