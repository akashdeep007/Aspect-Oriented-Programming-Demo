package com.demo.springaop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.demo.springaop.dao.AccountDAO;
@Configuration
public class HelloSpringApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		AccountDAO account = context.getBean("accountDAO", AccountDAO.class);
		
		account.addAccount();
				
		context.close();
	}

}







