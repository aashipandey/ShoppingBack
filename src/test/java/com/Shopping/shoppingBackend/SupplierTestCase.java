package com.Shopping.shoppingBackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import com.Shopping.shoppingBackend.dao.SupplierDAO;
import com.Shopping.shoppingBackend.model.Supplier;


public class SupplierTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Shopping");
		
		context.refresh();
		
		// Inserting a Supplier Object.
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		//Insertion TestCase
		
		Supplier supplier=new Supplier();
		supplier.setSuppid(1);
		supplier.setSuppname("AashiPandey");
		supplier.setAddress("Bhopal");
		

		supplierDAO.insertUpdateSupplier(supplier);		
		System.out.println("Supplier Inserted");
		
		//Retrieval TestCase
		
		/*Supplier supplier=supplierDAO.getSupplier(2);
		System.out.println("Supplier Name:"+supplier.getCatname());
		System.out.println("Supplier Description:"+supplier.getCatdesc());*/
		
		//Deletion TestCase
		/*Supplier supplier=supplierDAO.getSupplier(2);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");*/
		
		//Retrieving the Data
		
		/*List<Supplier> list=supplierDAO.getSupplierDetails();
		
		for(Supplier supplier:list)
		{
			System.out.println(supplier.getCatid()+":"+supplier.getCatname()+":"+supplier.getCatdesc());
		}*/
		
		//Update the Supplier
		//Supplier supplier=supplierDAO.getSupplier(3);
		/*supplier.setSuppname("Samsung");
		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("The Supplier Updated");*/
		
	}
}