package com.xyw55.springMVC.service.impl;

import com.xyw55.springMVC.service.IHelloWorldService;


/**
 * Created by xiayiwei on 16/9/24.
 */
public class HelloWorldService implements IHelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("======hello world");
    }
    @Override
    public void sayBefore(String param) {
        System.out.println("======hello world:" + param);
    }
    @Override
    public String sayAfterReturn() {
        System.out.println("======after return");
        return "after return";
    }

    @Override
    public void sayAfterExcept(){
        System.out.println("========before throwing");
        throw new RuntimeException();
    }

    @Override
    public void sayAround(String param) {
        System.out.println("========around:" + param);
    }

    @Override
    public void sayAdvisorBefore(String param) {
        System.out.println("========advisor before:"+param);
    }

}
