package com.xyw55.methodInject;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * MethodReplacer实现，完全替换掉被替换方法的方法体及返回值，
 * 其中reimplement方法重定义方法 功能，参数obj为被替换方法的对象，method为被替换方法，args为方法参数；
 * Created by xiayiwei on 16/8/27.
 */
public class PrinterReplacer implements MethodReplacer{
    private int counter = 0;

    public void print(String type) {
        System.out.println(type + " print replacer " + counter++);
    }

    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(objects[0] + " print replacer " + counter++);
        //注意此处不能再通过反射调用了,否则会产生循环调用，知道内存溢出
        //method.invoke(obj, new String[]{"hehe"});
        return null;
    }
}
