package com.Shopping.shoppingBackend.dao;
import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.*;
import org.hibernate.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Shopping.shoppingBackend.model.*;
@Transactional
@Repository("paymentDAO")
public class PaymentDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	/*public PaymentDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	*/
	@Transactional
	public void insertPayment(Payment payment)
	{
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(payment);
		//session.flush();
	}
	
	public Payment getPayment(int paymentid)
	{
		Session session=sessionFactory.openSession();
		Payment payment=(Payment)session.get(Payment.class,paymentid);
		session.close();
		return payment;
	}
	
	
	
	
}
