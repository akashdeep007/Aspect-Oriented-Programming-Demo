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
		boolean flag = false;
		try
		{
		List<Account> ob = account.listAccount(flag);
		for(Account temp : ob)
			System.out.println(temp);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		context.close();
	}

}







