package com.xyw55.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DemoBeans8.xml");
        StudentJDBCTemplate jdbcTemplate = (StudentJDBCTemplate) context.getBean("studentTemplate");

        jdbcTemplate.create("1", 1);
        jdbcTemplate.create("2", 1);
        jdbcTemplate.create("3", 1);
    }
}
