package com.xyw55.springdemo.mapper;

import com.xyw55.springdemo.dal.model.StudentDto;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xiayiwei on 16/9/6.
 */
public interface StudentMapper {
    @Select("SELECT * FROM student WHERE username = #{username}")
    public StudentDto selectStudent(String username);
}
