package com.demo.springaop.aspect;



import org.aspectj.lang.annotation.After;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class AfterAspect {

	@Pointcut("execution(public * listAccount())")
	private void p() {}
	
	@After("execution(public * listAccount(*))")
	public void afterReturning()
	{
		System.out.println("After Aspect");
	}
}
