package com.xyw55.demo7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DemoBeans7.xml");
        Student student = (Student) context.getBean("student");
//        student.setName("123");
        student.getAge();
        student.getName();
        student.printThrowException();
    }
}
