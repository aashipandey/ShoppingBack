package com.Shopping.shoppingBackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.*;
import org.hibernate.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Shopping.shoppingBackend.model.*;

@Repository("userdetailsDAO")
public class UserDetailsDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	/*public UserDetailsDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}*/
	
	@Transactional
	public void insertUpdateUserDetails(UserDetails userdetails)
	{
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(userdetails);
		session.flush();
	}
	
	public UserDetails getUserDetails(String username)
	{
		Session session=sessionFactory.openSession();
		UserDetails userdetails=(UserDetails)session.get(UserDetails.class,username);
		session.close();
		return userdetails;
	}
	
	@Transactional
	public void deleteUserDetails(UserDetails userdetails)
	{
		sessionFactory.getCurrentSession().delete(userdetails);
	}
	
	public List<UserDetails> getUserDetailsDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from UserDetails");
		List<UserDetails> list=query.list();
		session.close();
		return list;
	}
	
}
