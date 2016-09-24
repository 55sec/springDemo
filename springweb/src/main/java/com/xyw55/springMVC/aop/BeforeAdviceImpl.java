package com.xyw55.springMVC.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by xiayiwei on 16/9/24.
 */
public class BeforeAdviceImpl implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("=======before advice");
    }
}
