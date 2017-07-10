package com.Shopping.shoppingBackend;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

	@Configuration
	public class MyConfiguration 
	{
		@Bean("myBean")
		public MyBean getMyBean()
		{
			System.out.println("----- Bean Created and Strored in IOC Container");
			return new MyBean();
		}
	}
