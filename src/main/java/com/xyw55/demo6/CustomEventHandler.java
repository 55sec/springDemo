package com.xyw55.demo6;

import org.springframework.context.ApplicationListener;

/**
 * 监听自定义事件,并处理
 * Created by xiayiwei on 16/8/11.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.toString();
        System.out.println(customEvent.toString());
    }
}
