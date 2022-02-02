package com.springstart.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {

    @Pointcut("execution(public void com.springstart.classes.Library.get*(String)) ")
    private void allGetMethodsFromLibrary() {};

    @Pointcut("execution(public void com.springstart.classes.Library.return*()) ")
    private void allReturnMethodsFromLibrary() {}

    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()")
    private void someMethod() {}

    @Before("allGetMethodsFromLibrary()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить book/magazine");
    }

    @Before("allReturnMethodsFromLibrary()")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка return book/magazine");
    }

    @Before("someMethod()")
    public void logMessage(JoinPoint jp)
    {
        System.out.println("This is jp " + jp.getSignature() + " : " + jp.getArgs()[0]);
    }


}
