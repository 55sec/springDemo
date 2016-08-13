package com.xyw55.demo9;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by xiayiwei on 16/8/11.
 */
public interface StudentDao {
    public void setDataSource(DataSource dataSource);

    public void create(String name, Integer age);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void delete(Integer id);

    public void update(Integer id, Integer age);


}
