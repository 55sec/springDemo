package com.xyw55.methodInject;

/**
 * Created by xiayiwei on 16/8/26.
 */
public class Printer {
    private int counter = 0;

    public void print(String type) {
        System.out.println(type + " printer " + counter++);
    }
}
