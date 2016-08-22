package com.xyw55;

/**
 * Created by xiayiwei on 16/8/9.
 */
public class HelloChina {
    private String message;
    private String message2;
    private String message3;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

    public void getMessage() {
        System.out.println(message);
    }

    public String getMessage2() {
        System.out.println(message2);
        return message2;
    }

    public String getMessage3() {
        System.out.println(message3);
        return message3;
    }
}
