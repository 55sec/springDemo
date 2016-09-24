package com.xyw55.springMVC.service;

/**
 * Created by xiayiwei on 16/9/24.
 */
public interface IHelloWorldService {
    public void sayHello();

    void sayBefore(String param);

    String sayAfterReturn();

    void sayAfterExcept();

    void sayAround(String param);

    void sayAdvisorBefore(String param);
}
