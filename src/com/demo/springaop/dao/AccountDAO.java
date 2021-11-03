package com.demo.springaop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.springaop.entity.Account;

@Component
public class AccountDAO {
	
	public void addAccount()
	{
		System.out.println("Doing DB Work");
	}

	public List<Account> listAccount()
	{
		List<Account> ob = new ArrayList<Account>();
		Account a1 = new Account("abc","abc");
		Account a2 = new Account("xyz","xyz");
		ob.add(a1);
		ob.add(a2);
		return ob;
		
	}
}
