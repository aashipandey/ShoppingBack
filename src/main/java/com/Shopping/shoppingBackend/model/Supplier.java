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
@Table(name="Supplier")
public class Supplier implements Serializable 
{ 
	
	@Id
	@GeneratedValue
	int suppid;
	
	
	
	@NotEmpty(message = "Please enter your Suppliername.")
	@Size(min = 5, max = 25, message = "Your Supplier name must be within the specified size.")
	String suppname;
	
	@NotEmpty(message = "Please enter your address.")
	@Size(min = 5, max = 30, message = "Your address must be within the specified size.")
	String address;

	public int getSuppid() {
		return suppid;
	}

	public void setSuppid(int suppid) {
		this.suppid = suppid;
	}

	public String getSuppname() {
		return suppname;
	}

	public void setSuppname(String suppname) {
		this.suppname = suppname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	
	

	

}

