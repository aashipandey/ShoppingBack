package com.Shopping.shoppingBackend.dao;

import java.util.List;



import javax.transaction.Transactional;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Shopping.shoppingBackend.model.*;
@Transactional
@Repository("cartDAO")
public class CartDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	/*public CartDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}*/
	
	@Transactional
	public void addToCart(Cart cartitem)
	{
		//sessionFactory.openSession().saveOrUpdate(cartitem);
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(cartitem);
		session.flush();
	}
	
	public List<Cart> getCartItems(String username)
	{
		Session session=sessionFactory.openSession();
		
		Query query=session.createQuery("from Cart where username='"+username+"' and status='N'");
		//query.setParameter("username",username);
		@SuppressWarnings("unchecked")
		List<Cart> list=query.list();
	
		return list;
	}
	

	@Transactional
	public void deleteCartItem(Cart cart)
	{
		/*sessionFactory.getCurrentSession().delete(cart);*/
		Session session=sessionFactory.openSession();
		session.delete(cart);
		session.flush();

	}
	
	public Cart getCartItem(int citemid)
	{
		Session session=sessionFactory.openSession();
		
		Cart cart=(Cart)session.get(Cart.class,citemid);
	
		return cart;
	}
	

	@Transactional
	public void updateCartItem(Cart cart)
	{
		//sessionFactory.getCurrentSession().update(cart);
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(cart);
		session.flush();
	}
	
	
	
	
}


