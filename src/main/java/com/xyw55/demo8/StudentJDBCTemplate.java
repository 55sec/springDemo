package com.xyw55.demo8;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class StudentJDBCTemplate implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {
        String sql = "insert into Student (name, age) values (?, ?)";
        jdbcTemplate.update(sql, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    public Student getStudent(Integer id) {
        return null;
    }

    public List<Student> listStudents() {
        return null;
    }

    public void delete(Integer id) {

    }

    public void update(Integer id, Integer age) {

    }
}
