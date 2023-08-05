package org.wipro.pack;


import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class BeforeLoggingAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before advice: The method is about to start.");
    }
}

