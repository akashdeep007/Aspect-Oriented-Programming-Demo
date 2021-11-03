package com.demo.springaop.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.demo.springaop.entity.Account;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println("Doing DB Work");
	}

	public List<Account> listAccount(boolean flag) {
		if (flag == true)
			throw new RuntimeException("Manual Exception for Testing");
		else {
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<Account> ob = new ArrayList<Account>();
			Account a1 = new Account("abc", "abc");
			Account a2 = new Account("xyz", "xyz");
			ob.add(a1);
			ob.add(a2);
			return ob;
		}
	}
}
