package com.demo.springaop;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.demo.springaop.dao.AccountDAO;
import com.demo.springaop.entity.Account;
@Configuration
public class HelloSpringApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		AccountDAO account = context.getBean("accountDAO", AccountDAO.class);
		
		account.addAccount();
		List<Account> ob = account.listAccount();
		for(Account temp : ob)
			System.out.println(temp);
		context.close();
	}

}







