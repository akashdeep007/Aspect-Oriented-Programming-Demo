package com.demo.springaop.aspect;




import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class AroundAspect {

	@Pointcut("execution(public * listAccount())")
	private void p() {}
	
	@Around("execution(public * listAccount(*))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("Around Aspect");
		long begin = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long end = System.currentTimeMillis();
		long difference = end - begin;
		System.out.println("Time taken :"+difference/1000.0); 
		return result;
	}
}
