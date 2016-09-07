package com.xyw55.springdemo;

import com.xyw55.springdemo.dal.model.StudentDto;
import com.xyw55.springdemo.mapper.StudentMapper;
import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xiayiwei on 16/9/6.
 */
public class StudentTest {
    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void setUp() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        Configuration configuration = sqlSessionFactory.getConfiguration();
        MapperRegistry mapperRegistry = configuration.getMapperRegistry();
        System.out.println(mapperRegistry.getMappers());
    }

    @Test
    public void selectXMLText() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            StudentDto studentDto = session.selectOne("com.mapper.StudentMapper.selectStudent", "13");
            System.out.println(studentDto.getName());
        }finally {
            session.close();
        }
    }

    @Test
    public void selectAnnotationTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            StudentDto studentDto = studentMapper.selectStudent("13");
            System.out.println(studentDto.getName());
        }finally {
            session.close();
        }
    }

}
