package com.xyw55.demo9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DemoBeans9.xml");
//        StudentJDBCTemplate jdbcTemplate = (StudentJDBCTemplate) context.getBean("studentTemplate");
//
//        jdbcTemplate.create("4", 1);
//        jdbcTemplate.create("5", 1);
//        jdbcTemplate.create("6", 1);


        StudentDao studentDao = (StudentDao) context.getBean("studentTemplate");
        studentDao.create("13", 13);
        studentDao.create("12", 12);
        studentDao.create("11", 11);

    }
}
