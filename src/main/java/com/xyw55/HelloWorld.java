package com.xyw55;

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

    public void init() {
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }

}
