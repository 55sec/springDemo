package com.xyw55.methodInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/8/26.
 */
public class MainMethodInject {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("methodInject.xml");
//        HelloImpl helloApi1 = context.getBean("helloApi1", HelloImpl.class);
//        helloApi1.sayHello();
//        HelloImpl helloApi2 = context.getBean("helloApi1", HelloImpl.class);
//        helloApi1.sayHello();
//
//        HelloApi helloApi3 = context.getBean("helloApi2", HelloApi.class);
//        helloApi3.sayHello();
//        HelloApi helloApi4 = context.getBean("helloApi2", HelloApi.class);
//        helloApi4.sayHello();

        HelloApi helloApi5 = context.getBean("helloApi3", HelloApi.class);
        helloApi5.sayHello();
        HelloApi helloApi6 = context.getBean("helloApi3", HelloApi.class);
        helloApi5.sayHello();
        HelloApi helloApi7 = context.getBean("helloApi4", HelloApi.class);
        helloApi5.sayHello();
        HelloApi helloApi8 = context.getBean("helloApi4", HelloApi.class);
        helloApi5.sayHello();
    }
}
