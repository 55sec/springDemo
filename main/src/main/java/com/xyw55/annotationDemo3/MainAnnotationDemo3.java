package com.xyw55.annotationDemo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/9/8.
 */
public class MainAnnotationDemo3 {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationDemo3.xml");
        MovieRecommeder movieRecommeder = context.getBean("movieRecommeder", MovieRecommeder.class);
        movieRecommeder.show();
    }



}
