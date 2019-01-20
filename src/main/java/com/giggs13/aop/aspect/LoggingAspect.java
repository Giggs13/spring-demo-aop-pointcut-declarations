package com.giggs13.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.giggs13.aop.dao.*.*(..))")
    private void daoPackage() {
    }

    @Before("daoPackage()")
    private void beforeAddAccountAdvice() {
        System.out.println("\n---> Executing @Before advice on method");
    }

    @Before("daoPackage()")
    private void performApiAnalytics() {
        System.out.println("\n---> Performing API analytics");
    }
}
