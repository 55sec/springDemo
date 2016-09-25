package com.xyw55.springMVC.service.impl;

import com.xyw55.springMVC.service.IHelloWorldService;
import org.aspectj.lang.annotation.Before;

/**
 * Created by xiayiwei on 16/9/25.
 */
public class HelloWorldService2 implements IHelloWorldService {
    @Override
    public void sayHello() {

    }

    @Override
    public void sayBefore(String param) {
        System.out.println("say before:" + param);
    }

    @Override
    public String sayAfterReturn() {
        System.out.println("====say after return");
        return "return";
    }

    @Override
    public void sayAfterExcept() {
        System.out.println("==== say after except");
        throw new RuntimeException();
    }

    @Override
    public void sayAround(String param) {
        System.out.println("===around process:" + param);
    }

    @Override
    public void sayAdvisorBefore(String param) {

    }
}
