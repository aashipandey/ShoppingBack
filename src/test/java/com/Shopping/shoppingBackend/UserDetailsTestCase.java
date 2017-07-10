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
		userdetails.setUsername("Sourabh");
		userdetails.setPassword("aashi");
		userdetails.setAddress("Bittan Market");
		userdetails.setEmail("Aashipandey@gmail.com");
		userdetails.setMobile("7389616986");
		userdetails.setRole("ROLE_ADMIN");
		userdetails.setCustname("rainy");
		
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
		userdetails.setUsername("Ayaan");
		userdetailsDAO.insertUpdateUserDetails(userdetails);
		System.out.println("The UserDetails Updated");
		
	}
}