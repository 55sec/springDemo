package com.xyw55.resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

/**
 * Created by xiayiwei on 16/9/7.
 */
public class Res2Main {

    @Test
    public void testResourceLoad() {
        ResourceLoader loader = new DefaultResourceLoader();

        Resource resource = loader.getResource("classpath:com/xyw55/resource/test1.txt");
        //验证返回的是ClassPathResource
        Assert.assertEquals(ClassPathResource.class, resource.getClass());

        Resource resource2 = loader.getResource("file:com/xyw55/resource/test1.txt");
        //验证返回的是ClassPathResource
        Assert.assertEquals(UrlResource.class, resource2.getClass());

        Resource resource3 = loader.getResource("com/xyw55/resource/test1.txt");
        //验证返默认可以加载ClasspathResource
        Assert.assertTrue(resource3 instanceof ClassPathResource);
    }

    @Test
    public void testResourceLoaderAware() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resourceLoaderAware.xml");
        ResourceBean resourceBean = context.getBean(ResourceBean.class);
        ResourceLoader loader = resourceBean.getResourceLoader();
        Assert.assertTrue(loader instanceof ApplicationContext);
    }

    @Test
    public void testResource() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resourceLoaderAware.xml");
        ResourceBean2 resourceBean1 = context.getBean("resource1", ResourceBean2.class);
        ResourceBean2 resourceBean2 = context.getBean("resource2", ResourceBean2.class);
        Assert.assertTrue(resourceBean1.getResource() instanceof ClassPathResource);
        Assert.assertTrue(resourceBean2.getResource() instanceof ClassPathResource);
    }

}
