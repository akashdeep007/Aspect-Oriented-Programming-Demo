package com.demo.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingDemoAspect {

	@Before("execution(public void addAccount())")
	public void beforeMyaccount()
	{
		System.out.println("Before my account logging");
	}
}
