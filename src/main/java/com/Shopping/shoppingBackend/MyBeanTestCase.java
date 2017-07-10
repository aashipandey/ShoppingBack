package com.Shopping.shoppingBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Shopping.shoppingBackend.MyBean;

public class MyBeanTestCase 
{
	public static void main(String arg[])
	{
		System.out.println("---Test Case - AnnotationConfigApplication Context Object Created---");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		System.out.println("---My Bean Created---");
		
		MyBean myBean=(MyBean)context.getBean("myBean");
		
		myBean.Display();
		
	}
}