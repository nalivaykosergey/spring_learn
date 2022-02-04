package com.spring_mvc_project.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectClass {

    @Around("execution(* com.spring_mvc_project.dao.EmployeeDAOIml.*Employee(..))")
    public Object logSaveOrDeleteMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        String methodName = proceedingJoinPoint.getSignature().getName();
        System.out.println("Method " + methodName + " is working");

        Object target = proceedingJoinPoint.proceed();

        System.out.println("Method " + methodName + " is stop working");
        return target;
    }

}
