package com.Shopping.shoppingBackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

import com.Shopping.shoppingBackend.dao.ProductDAO;

import com.Shopping.shoppingBackend.model.Product;



public class ProductTestCase
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Shopping");
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		Product product=new Product();
		//product.setProdid(1);
		product.setProdname("Mobile");
		product.setCatid(101);
		product.setSuppid(11);
		product.setQuantity(100);
		product.setPrice(12000);
		product.setProddesc("4G LTE phones");

		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted");
		
		//Retrieval TestCase
		
		/*Product product=productDAO.getProduct(2);
		System.out.println("Product Name:"+product.getProdname());
		*/
		
		//Deletion TestCase
		/*Product product=productDAO.getProduct(2);
		productDAO.deleteProduct(product);
		System.out.println("The Product Deleted");*/
		
		//Retrieving the Data
		
		/*List<Product> list=productDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.println(product.getProdid()+":"+product.getProdname()+":");
		}*/
		
		//Update the Product
		//Product product=productDAO.getProduct(3);
		/*product.setProdname("WifiEnMobile");
		productDAO.insertUpdateProduct(product);
		System.out.println("The Product Updated");*/
		
	}
}