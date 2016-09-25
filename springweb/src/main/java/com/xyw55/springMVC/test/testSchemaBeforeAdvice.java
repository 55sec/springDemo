package com.xyw55.springMVC.test;

import com.xyw55.springMVC.service.IHelloWorldService;
import com.xyw55.springMVC.service.IIntroductionService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiayiwei on 16/9/24.
 */
public class testSchemaBeforeAdvice {
    @Test
    public void testSchemaBeforeAdvice(){
        System.out.println("======================================");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//        IHelloWorldService helloworldService = ctx.getBean("helloWorld", IHelloWorldService.class);
//        helloworldService.sayBefore("before");
//        helloworldService.sayAfterReturn();
//        helloworldService.sayAfterExcept();
//        helloworldService.sayAround("test");
//        helloworldService.sayAdvisorBefore("advisor");
//        IIntroductionService helloworldService2 = ctx.getBean("helloWorld", IIntroductionService.class);
//        helloworldService2.introduce();


        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config2.xml");
        IHelloWorldService helloworldService = ctx.getBean("helloworldService", IHelloWorldService.class);
        helloworldService.sayBefore("fir");
//        helloworldService.sayAfterReturn();
//        helloworldService.sayAfterExcept();
//        helloworldService.sayAround("laia");

//        IIntroductionService helloworldService2 = ctx.getBean("helloworldService", IIntroductionService.class);
//        helloworldService2.introduce();
        System.out.println("======================================");

    }
}
