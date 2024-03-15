package com.getitdone.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	  @Pointcut("execution(* com.getitdone.ServiceClass.*(..))")
	    public void userServiceMethods() {}

	    @Before("userServiceMethods()")
	    public void logMethodCall(JoinPoint joinPoint) {
	        String methodName = joinPoint.getSignature().getName();
	        Object[] args = joinPoint.getArgs();

	        System.out.println("Method called: " + methodName);
	        System.out.println("Input parameters: ");
	        for (Object arg : args) {
	            System.out.println(arg);
	        }
	    }

	    @AfterReturning(pointcut = "userServiceMethods()", returning = "result")
	    public void logMethodReturn(JoinPoint joinPoint, Object result) {
	        String methodName = joinPoint.getSignature().getName();

	        System.out.println("Method returned: " + methodName);
	        System.out.println("Output: " + result);
	    }
}
