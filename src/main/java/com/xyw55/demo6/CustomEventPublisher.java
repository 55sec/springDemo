package com.xyw55.demo6;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * 自定义事件触发器
 * Created by xiayiwei on 16/8/11.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        //触发自定义事件
        publisher.publishEvent(ce);
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
