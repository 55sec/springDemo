package com.xyw55.springMVC.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by xiayiwei on 16/9/24.
 */
public class HelloWorldAspect {

    // 前置通知
    public void beforeAdvice() {
        System.out.println("=====before advice");
    }
    // 前置通知
    public void beforeAdvice(String param) {
        System.out.println("=====before advice:"+param);
    }

    // 后置最终通知
    public void afterFinallyAdvice() {
        System.out.println("=====after finally advice");
    }


    public void afterReturnAdvice(String param){
        System.out.println("=====after return advice:"+ param);
    }

    public void afterThrowAdvice(Throwable param){
        System.out.println("=====after throw advice:"+ param);
    }

    /**
     * 环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型,
     * 在通知实现方法内部使用 ProceedingJoinPoint的proceed()方法使目标方法执行,proceed 方法可以传入可选的Object[]数组,该数组的值将被作为目标方法执行时的参数
     * @param pip
     * @return
     * @throws Throwable
     */
    public Object aroundAdvice(ProceedingJoinPoint pip) throws Throwable {
        System.out.println("======arounf before advice");
        Object retVal = pip.proceed(new Object[]{"replace"});
        System.out.println("=====around after advice");
        return retVal;
    }

}
