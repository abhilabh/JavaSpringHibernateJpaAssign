package org.wipro.pack;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* A.printOddNumbers())")
	public void logBeforeMethodExecution() {
		System.out.println("Before the method execution...");
	}

	@Around("execution(* A.printOddNumbers())")
	public Object logMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by the method: " + (endTime - startTime) + " ms");
		return result;
	}
}
