package com.demo.springaop.aspect;

import java.util.List;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.demo.springaop.entity.Account;

@Component
@Aspect
public class AfterReturningAspect {

	@Pointcut("execution(public * listAccount())")
	private void p() {}
	
	@AfterReturning(pointcut = "p()",returning = "result")
	public void afterReturning(List<Account> result)
	{
		if(!(result.isEmpty()))
		{
			for(Account temp : result)
			{
				String username = temp.getUsername();
				String upperCase = username.toUpperCase();
				temp.setUsername(upperCase);
			}
		}
		System.out.println("After Returning Aspect");
	}
}
