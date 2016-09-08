package com.xyw55.annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.inject.Inject;

/**
 * Created by xiayiwei on 16/9/8.
 */
public class Team {
    @Inject
    @Qualifier("studenta")
    private Student student;

    @Inject
    @Qualifier("teacherb")
    private Teacher teacher;

    private String testidref;

//    @Required
//    @Inject
//    public void setStudent(Student student) {
//        this.student = student;
//    }

//    @Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

    public void setTestidref(String testidref) {
        this.testidref = testidref;
    }

    public void show() {
        if (student != null) {
            System.out.println(student.getUsername());
        }
        if (teacher != null) {
            System.out.println(teacher.getUsername());
        }

        System.out.println(testidref);
    }
}
