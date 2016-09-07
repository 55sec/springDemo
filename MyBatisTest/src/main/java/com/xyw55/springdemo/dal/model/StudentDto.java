package com.xyw55.springdemo.dal.model;

import java.io.Serializable;

/**
 * Created by xiayiwei on 16/9/6.
 */
public class StudentDto implements Serializable {
    private Integer age;
    private String username;
    private Integer id;

    public StudentDto() {
    }

    public StudentDto(Integer age, String name, Integer id) {
        this.age = age;
        this.username = name;
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
