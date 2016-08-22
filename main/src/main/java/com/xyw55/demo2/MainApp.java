package com.xyw55.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/8/9.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DemoBeans2.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
        System.out.println(textEditor.getList().toString());
        System.out.println(textEditor.getSet().toString());
        System.out.println(textEditor.getMap().toString());
    }
}
