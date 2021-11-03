package com.demo.springaop.aspect;



import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class AfterThrowingAspect {

	@Pointcut("execution(public * listAccount(*))")
	private void p() {}
	
	@AfterThrowing(pointcut = "p()")
	public void afterThrowing() 
	{

		System.out.println("After Throwing Aspect");
	}
}
