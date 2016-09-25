package com.xyw55.springMVC.aop;

import com.xyw55.springMVC.service.IIntroductionService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by xiayiwei on 16/9/25.
 */
@Aspect
public class HelloWorld2Aspect {
    @Pointcut(value = "execution(* com.xyw55.springMVC.service.impl.*.sayBefore(..)) && args(param)", argNames = "param")
    public void beforePointcut(String param) {
//        System.out.println("hello world2 before point:" + param);
    }

    @Before(value = "beforePointcut(param)", argNames = "param")
    private void beforeAdvice(String param) {
        System.out.println("hello world2 before advice:" + param);
    }

//    pointcut:同样是指定切入点表达式或命名切入点,如果指定了将覆盖value属性指定的,pointcut具有高优先级;
    @AfterReturning(value = "execution(* com.xyw55.springMVC..*.sayBefore(..))", pointcut = "execution(* com.xyw55.springMVC.service..*.sayAfterReturn(..))", argNames = "retVal", returning = "retVal")
    public void afterReturnAdvice(Object retVal) {
        System.out.println("=====after returning advice retVal:" + retVal);
    }

    @AfterThrowing(pointcut = "execution(* com.xyw55.springMVC.service..*.sayAfterExcept(..))", throwing = "exception")
    public void afterThrowAdvice(Throwable exception) {
        System.out.println("after throw advice:" + exception);
    }

    @After(value = "execution(* com.xyw55.springMVC..*.sayBefore(..))")
    public void afterFinallyAdvice() {
        System.out.println("sfter finally advice");
    }

    @Around(value = "execution(* com.xyw55..*.sayAround(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("====around before advice");
        Object retVal = pjp.proceed(new Object[]{"replace"});
        System.out.println("=====around after advice");
        return retVal;
    }

    @DeclareParents(value = "com.xyw55.springMVC.service.IHelloWorldService+", defaultImpl =com.xyw55.springMVC.service.impl.IntroductionService.class)
    private IIntroductionService introductionService;
}
