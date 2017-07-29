package com.Shopping.shoppingBackend.dao;

import java.util.List;



import javax.transaction.Transactional;

import org.hibernate.*;
import org.hibernate.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Shopping.shoppingBackend.model.*;
@Transactional
@Repository("shippingdetailsDAO")
public class ShippingDetailsDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	/*public PaymentDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	*/
	@Transactional
	public void insertShippingDetails(ShippingDetails shippingdetails)
	{
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(shippingdetails);
		//session.flush();
	}
	
	public ShippingDetails getShippingDetails(int orderid)
	{
		Session session=sessionFactory.openSession();
		ShippingDetails shippingdetails=(ShippingDetails)session.get(Payment.class,orderid);
		session.close();
		return shippingdetails;
	}
	
	
	
	
}
