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
	int Suppid;
	
	@NotEmpty(message = "Please enter your Product description.")
	@Size(min = 15, max = 50, message = "Your product description must be within the specified size.")
	String proddesc;
	
	@NotEmpty(message = "Please enter your Suppliername.")
	@Size(min = 5, max = 25, message = "Your Supplier name must be within the specified size.")
	String Suppname;
	
	@NotEmpty(message = "Please enter your address.")
	@Size(min = 15, max = 30, message = "Your address must be within the specified size.")
	String Address;
	
	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public int getSuppid() {
		return Suppid;
	}

	public void setSuppid(int suppid) {
		Suppid = suppid;
	}

	public String getSuppname() {
		return Suppname;
	}

	public void setSuppname(String suppname) {
		Suppname = suppname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	

	

}

