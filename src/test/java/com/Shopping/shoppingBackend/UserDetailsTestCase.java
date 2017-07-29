package com.Shopping.shoppingBackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import com.Shopping.shoppingBackend.dao.UserDetailsDAO;
import com.Shopping.shoppingBackend.model.UserDetails;


public class UserDetailsTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Shopping");
		
		context.refresh();
		
		// Inserting a UserDetails Object.
		UserDetailsDAO userdetailsDAO=(UserDetailsDAO)context.getBean("userdetailsDAO");
		
		//Insertion TestCase
		
		UserDetails userdetails=new UserDetails();
//		userdetails.setUserId(1);
		userdetails.setUsername("rainy");
		userdetails.setCustname("rainy");
		userdetails.setPassword("12345");
		userdetails.setAddress("Bhopal");
		userdetails.setEmail("rainy@gmail.com");
		userdetails.setMobile("1234567890");
		userdetails.setRole("ROLE_ADMIN");
		userdetails.setEnabled(true);
		
		userdetailsDAO.insertUpdateUserDetails(userdetails);		
		System.out.println("UserDetails Inserted");
		
		//Retrieval TestCase
		
		/*UserDetails userdetails=userdetailsDAO.getUserDetails(2);
		System.out.println("UserDetails Name:"+userdetails.getUsername());
		System.out.println("UserDetails Description:"+userdetails.getAddress());*/
		
		//Deletion TestCase
		/*UserDetails userdetails=userdetailsDAO.getUserDetails(2);
		userdetailsDAO.deleteUserDetails(userdetails);
		System.out.println("The UserDetails Deleted");*/
		
		//Retrieving the Data
		
		/*List<UserDetails> list=userdetailsDAO.getUserDetailsDetails();
		
		for(UserDetails userdetails:list)
		{
			System.out.println(userdetails.getUsername()+":"+userdetails.getPassword()+":"+userdetails.getAddress());
		}*/
		
		//Update the UserDetails
		//UserDetails userdetails=userdetailsDAO.getUserDetails(3);
		/*userdetails.setUsername("");
		userdetailsDAO.insertUpdateUserDetails(userdetails);
		System.out.println("The UserDetails Updated");*/
		
	}
}