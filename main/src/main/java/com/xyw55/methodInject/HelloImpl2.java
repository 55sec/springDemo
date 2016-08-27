package com.xyw55.methodInject;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 实现ApplicationContextAware类进行方法注入
 * 现了ApplicationContextAware接口的对象会拥有一个ApplicationContext的引用，这样我们就可以已编程的方式操作ApplicationContext
 * Created by xiayiwei on 16/8/27.
 */
public class HelloImpl2 implements HelloApi, ApplicationContextAware {
    private ApplicationContext applicationContext;
    private Printer printer;
    public void sayHello() {
        this.printer.print("setter ");
        createprototypePrinter().print("prototype ");
        createsingletonPrinter().print("singleton ");
    }

    private Printer createprototypePrinter() {
        return (Printer) this.applicationContext.getBean("prototypePrinter");
    }

    private Printer createsingletonPrinter() {
        return (Printer) this.applicationContext.getBean("singletonPrinter");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
