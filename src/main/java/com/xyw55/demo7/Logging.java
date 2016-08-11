package com.xyw55.demo7;

import org.aspectj.lang.annotation.*;

/**
 * Created by xiayiwei on 16/8/11.
 */
@Aspect
public class Logging {

    /**
     *     @Pointcut("execution(* com.xyw55.demo7.*.*(..))")
     *     切点时所有方法
     *     @Pointcut("execution(* com.xyw55.demo7.Student.getName(..))")
     *     切点方法为getName
     *
     */
    @Pointcut("execution(* com.xyw55.demo7.*.*(..))")
    private void selectAll(){}

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("before advice");
    }

    public void afterAdvice(){
        System.out.println("after advice");
    }

    @AfterReturning(pointcut = "selectAll()",returning = "retval")
    public void afterReturningAdvice(Object retval) {
        System.out.println("returning..." + retval.toString());
    }

    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("after exception..." + ex.toString());
    }
}
