package com.xyw55;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Created by xiayiwei on 16/8/8.
 */
public class MainApp {
    public static void main(String[] args) {
        //1.ClassPathXmlApplicationContext
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        // 2.ClassPathXmlApplicationContext
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");

        // 3. 从工程目录开始找
//        BeanFactory beanFactory = new FileSystemXmlApplicationContext("/src/main/resources/Beans.xml");
//        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        context.registerShutdownHook();


//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        helloWorld.getMessage();
//        helloWorld.getMessage2();
//
//        HelloChina helloChina = (HelloChina) context.getBean("helloChina");
//        helloChina.getMessage();
//        helloChina.getMessage2();
//        helloChina.getMessage3();

    }
}
