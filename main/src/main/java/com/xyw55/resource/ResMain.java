package com.xyw55.resource;

import org.springframework.core.io.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

/**
 * Created by xiayiwei on 16/8/27.
 */
public class ResMain {
    public static void main(String[] args) {
        ResMain resMain = new ResMain();
        //ByteArrayResource
        Resource resource = new ByteArrayResource("hello spring resource".getBytes());
        if (resource.exists()) {
            resMain.dumpStream(resource);
            System.out.println(resource.isOpen());
        }

        //ByteArrayResource
        ByteArrayInputStream bis = new ByteArrayInputStream("hello spring bis".getBytes());
        InputStreamResource isr = new InputStreamResource(bis);
        if (isr.exists()) {
            resMain.dumpStream(isr);
            System.out.println(isr.isOpen());
        }

        //FileSystemResource 从文件系统加载资源
        File file = new File("/Users/xiayiwei/code/demos/SpringDemo/main/src/main/resources/test.txt");
        FileSystemResource fileSystemResource = new FileSystemResource(file);
        if (fileSystemResource.exists()) {
            resMain.dumpStream(fileSystemResource);
            System.out.println(fileSystemResource.isOpen());
        }
        resMain.testClassPathRes();
        resMain.testUrlresource();

    }

    private void testClassPathRes() {
        /**
         * 类路径一般都是相对路径，即相对于类路径或相对于当前类的路径，
         * 因此如果使用“/test1.properties”带前缀“/”的路径，将自动删除“/”得到“test1.properties”。
         */
        // 1. 使用默认的加载器加载资源，将加载当前ClassLoader类路径上相对于根路径的资源
        Resource resource1 = new ClassPathResource("1.properties");
        if (resource1.exists()) {
            dumpStream(resource1);
        }
        try {
            System.out.println(resource1.getFile().getAbsolutePath());
            System.out.println(resource1.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. 使用指定的ClassLoader进行加载资源，将加载指定的ClassLoader类路径上相对于根路径的资源：
        ClassLoader cl = this.getClass().getClassLoader();
        Resource resource2 = new ClassPathResource("1.properties", cl);
        if (resource2.exists()) {
            dumpStream(resource2);
        }
        try {
            System.out.println(resource2.getFile().getAbsolutePath());
            System.out.println(resource2.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 3. 从当前类去查找
        // 使用指定的类进行加载资源，将尝试加载相对于当前类的路径的资源
        Class clazz = this.getClass();
        Resource resource3 = new ClassPathResource("../../../1.properties", clazz);
        if (resource3.exists()) {
            dumpStream(resource3);
        }
        try {
            System.out.println(resource3.getFile().getAbsolutePath());
            System.out.println(resource3.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4.加载jar包里的资源，首先在当前类路径下找不到，最后才到Jar包里找，而且在第一个Jar包里找到的将被返回
        /**
         * 如果当前类路径包含“1.html”，在项目的“resources”目录下，将加载该资源，
         * 否则将加载Jar包里的“1.html”，而且不能使用“resource.getFile()”，应该使用“resource.getURL()”，
         * 因为资源不存在于文件系统而是存在于jar包里，URL类似于“file:/C:/.../***.jar!/1.html”。
         * */
        Resource resource4 = new ClassPathResource("1.html");
        if (resource1.exists()) {
            dumpStream(resource1);
        }
        try {
            System.out.println(resource1.getURL().getPath());
            System.out.println(resource1.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testUrlresource() {
        /**
         * UrlResource代表URL资源，用于简化URL资源访问。“isOpen”永远返回false，表示可多次读取资源。
         * UrlResource一般支持如下资源访问：
         * http：通过标准的http协议访问web资源，如new UrlResource(“http://地址”)；
         * ftp：通过ftp协议访问资源，如new UrlResource(“ftp://地址”)；
         * file：通过file协议访问本地文件系统资源，如new UrlResource(“file:d:/test.txt”)；
         */
        try {
//            Resource resource = new UrlResource("http://www.xyw55.com");
            Resource resource = new UrlResource("file:/Users/xiayiwei/code/demos/SpringDemo/main/src/main/resources/test.txt");
            if (resource.exists()) {
                dumpStream(resource);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



    }

    public void testServletresource() {
        /**
         * ServletContextResource
         * ServletContextResource代表web应用资源，
         * 用于简化servlet容器的ServletContext接口的getResource操作和getResourceAsStream操作；
         */
    }

    private void dumpStream(Resource resource) {
        InputStream is = null;
        try {
            //1. 获取资源文件
            is = resource.getInputStream();
            //2.读取资源文件
            byte[] descByte = new byte[is.available()];
            is.read(descByte);
            System.out.println(new String(descByte));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //3. 关闭资源
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
