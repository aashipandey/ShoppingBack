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
@Table(name="Category")
public class Category implements Serializable
{
	@Id
	@GeneratedValue
	int catid;
	
	@NotEmpty(message = "Please enter your category description")
	@Size(min = 25, max = 50, message = "Your category description must be within the specified size.")
	String catdesc;
	

	@NotEmpty(message = "Please enter your Categoryname.")
	@Size(min = 5, max = 25, message = "Your Category name must be within the specified size.")
	String catname;
	
	@NotEmpty(message = "Please enter your address")
	@Size(min = 15, max = 50, message = "Your address must be within the specified size.")
	String address;
	
	@NotEmpty(message = "Please enter your product description")
	@Size(min = 25, max = 50, message = "Your product description must be within the specified size.")
	String proddesc;
	
	
	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public String getCatdesc() {
		return catdesc;
	}

	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}
	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}

