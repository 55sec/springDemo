package com.xyw55.demo6;

import org.springframework.context.ApplicationEvent;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "CustomEvent{}";
    }
}
