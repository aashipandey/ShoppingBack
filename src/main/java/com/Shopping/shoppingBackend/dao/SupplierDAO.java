package com.Shopping.shoppingBackend.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Shopping.shoppingBackend.model.*;

@Repository("supplierDAO")
public class SupplierDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	/*public SupplierDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}*/
	
	@Transactional
	public void insertUpdateSupplier(Supplier supplier)
	{
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(supplier);
		session.flush();
	}
	
	public Supplier getSupplier(int suppid)
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,suppid);
		session.close();
		return supplier;
	}
	
	@Transactional
	public void deleteSupplier(Supplier supplier)
	{
		Session session=sessionFactory.openSession();
		session.delete(supplier);
		session.flush();
		//sessionFactory.getCurrentSession().delete(supplier);
	}
	
	public List<Supplier> getSupplierDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> list=query.list();
		session.close();
		return list;
	}
	
}
