package com.Shopping.shoppingBackend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Product")
public class Product  implements Serializable
{
	@Id
	@GeneratedValue
	int prodid;
	
	@NotEmpty(message = "Please enter your Product description.")
	@Size(min = 15, max = 50, message = "Your product description must be within the specified size.")
	String proddesc;
	
	@NotEmpty(message = "Please enter your Product name.")
	@Size(min = 4, max = 15, message = "Your product name must be within the specified size.")
	String prodname;
	

	@NotEmpty(message = "Please enter your category id.")
	@Size(min = 1, max = 5, message = "Your category id must be within the specified size.")
	int catid;
	
	@NotEmpty(message = "Please enter your supplier id.")
	@Size(min = 1, max = 5, message = "Your supplier id must be within the specified size.")
	int suppid;
	
	@NotEmpty(message = "Please enter your quantity.")
	@Size(min = 1, max = 50, message = "Your quantity must be within the specified size.")
	int quantity;
	
	@NotEmpty(message = "Please enter your price.")
	@Size(min = 2,  message = "Your price must be within the specified size.")
	int price;
	
	
	@Transient
	MultipartFile pimage;
	
	public MultipartFile getPimage()
	{
		return pimage;
	}
	
	public void setPimage(MultipartFile pimage)
	{
		this.pimage=pimage;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public int getSuppid() {
		return suppid;
	}

	public void setSuppid(int suppid) {
		this.suppid = suppid;
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

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	
	

}

