package com.xyw55;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by xiayiwei on 16/8/8.
 */
public class HelloWorld {
    private String message;
    private String message2;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("message is " + message);
    }

    public void getMessage2() {
        System.out.println(message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    @PostConstruct //初始化完成后的回调函数
    public void init() {
        System.out.println("init");
    }

    @PreDestroy //实例destory前的回调函数
    public void destroy(){
        System.out.println("destroy");
    }

}
