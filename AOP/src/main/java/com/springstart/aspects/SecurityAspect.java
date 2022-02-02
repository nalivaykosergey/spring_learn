package com.springstart.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    @Pointcut("execution(public void get*(..))")
    private void accessPointCut() {};

    @Before("accessPointCut()")
    public void beforeGetSecurityAdvice() {
        System.out.println("Security advice log #1");
    }

}
