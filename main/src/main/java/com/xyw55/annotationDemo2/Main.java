package com.xyw55.annotationDemo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/9/8.
 */
public class Main {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationDemo2.xml");
        MovieRecommeder movieRecommeder = context.getBean("recomander", MovieRecommeder.class);
        MovieCatalog actionCatelog = movieRecommeder.getActionMovieCatalog();
        if (null != actionCatelog) {
            System.out.println(actionCatelog.getCate());
        }
        MovieCatalog comedyCatelog = movieRecommeder.getComedyMovieCatalog();
        if (null != comedyCatelog) {
            System.out.println(comedyCatelog.getCate());
        }
    }
}
