package com.xyw55.demo9;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by xiayiwei on 16/8/11.
 */
public class StudentJDBCTemplate implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
//    private PlatformTransactionManager transactionManager;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

//    public void setTransactionManager(PlatformTransactionManager transactionManager) {
//        this.transactionManager = transactionManager;
//    }

    public void create(String name, Integer age) {
//        TransactionDefinition definition = new DefaultTransactionDefinition();
//        TransactionStatus status = transactionManager.getTransaction(definition);
        try {
            String sql = "insert into Student (name, age) values (?, ?)";
            jdbcTemplate.update(sql, name, age);
            System.out.println("Created Record Name = " + name + " Age = " + age);
//            throw new RuntimeException("simulate Error condition") ;
//            transactionManager.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
//            transactionManager.rollback(status);
        }
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
