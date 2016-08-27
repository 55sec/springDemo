package com.xyw55.methodInject;

/**
 * Lookup方法注入。Lookup方法注入利用了容器的覆盖受容器管理的bean方法的能力，从而返回指定名字的bean实例。
 * Created by xiayiwei on 16/8/26.
 */
public abstract class HelloImpl implements HelloApi{
    private Printer printer;
    public void sayHello() {
        printer.print("setter ");
        createPrototypePrinter().print("prototype ");
        createSingletonPrinter().print("singleton ");
    }

    public abstract Printer createPrototypePrinter();

    public Printer createSingletonPrinter() {
        System.out.println("该方法不会调用,出错额");
        return new Printer();
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
