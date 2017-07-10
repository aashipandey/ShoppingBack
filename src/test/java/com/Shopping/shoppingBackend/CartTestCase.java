package com.Shopping.shoppingBackend;
import java.util.List;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Shopping.shoppingBackend.dao.CartDAO;
import com.Shopping.shoppingBackend.model.Cart;


public class CartTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Shopping");
		
		context.refresh();
		
		// Inserting a Cart Object.
		CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
		
		//Insertion TestCase
		
		Cart cart=new Cart();
		cart.setCartid(3);
		cart.setcitemid(3);
		cart.setProdname("Laptop");
		cart.setStatus("N");
		cart.setProdid(1);
		cart.setQuantity(20);
		cart.setPrice(20000);
		cart.setUsername("Sourabh");

		cartDAO.addToCart(cart);		
		System.out.println("Added to cart");
		
		List<Cart> list=cartDAO.getCartItems("Aashi");
		
		for(Cart cart1:list)
		{
			System.out.println(cart1.getCartid()+":::");
			System.out.println(cart1.getProductid()+":::");
			System.out.println(cart1.getProductname()+":::");
			System.out.println(cart1.getPrice()+":::");
			System.out.println(cart1.getQuantity()+":::");
		}
		System.out.println("Cart Item Displayed:");
		
		//Retrieval TestCase
		
		/*Cart cart=categoryDAO.getCategory(2);
		System.out.println("Cart Name:"+cart.getCatname());
		System.out.println("Cart Description:"+cart.getCatdesc());*/
		
		//Deletion TestCase
		/*Cart cart=categoryDAO.getCategory(2);
		categoryDAO.deleteCategory(cart);
		System.out.println("The Cart Deleted");*/
		
		//Retrieving the Data
		
		/*List<Cart> list=categoryDAO.getCategoryDetails();
		
		for(Cart cart:list)
		{
			System.out.println(cart.getCatid()+":"+cart.getCatname()+":"+cart.getCatdesc());
		}*/
		
		//Update the Cart
		//Cart cart=categoryDAO.getCategory(3);
		//cart.setCatname("WifiEnMobile");
		//categoryDAO.insertUpdateCategory(cart);
		//System.out.println("The Cart Updated");
		
	}
}