package com.xyw55.demo7;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        System.out.println("age: " + age);
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("name: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException() {
        System.out.println("Exceptiong raised");
        throw new IllegalArgumentException();
    }
}
