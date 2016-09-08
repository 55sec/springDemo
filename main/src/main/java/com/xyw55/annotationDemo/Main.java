package com.xyw55.annotationDemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/9/8.
 */
public class Main {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationdemo.xml");
        Team team = (Team) context.getBean("team");
        team.show();

    }

}
