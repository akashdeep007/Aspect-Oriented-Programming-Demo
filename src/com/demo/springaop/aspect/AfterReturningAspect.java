package com.demo.springaop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningAspect {

	@Pointcut("execution(public * listAccount())")
	private void p() {}
	
	@AfterReturning(pointcut = "p()")
	public void afterReturning()
	{
		System.out.println("After Returning Aspect");
	}
}
