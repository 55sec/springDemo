package com.xyw55.demo6;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("DemoBeans6.xml");
        context.start();
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.getMessage();

        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();

        context.stop();
    }
}
