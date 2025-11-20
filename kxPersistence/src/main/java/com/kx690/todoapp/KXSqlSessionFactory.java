package com.kx690.todoapp;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.*;
import java.util.Properties;

public class KXSqlSessionFactory {

    private static final String ENVIRONMENT = "development";


    public static SqlSession getSqlSession() throws IOException {


        try{
            Resource resource = new ClassPathResource("mybatis-config.xml");
            Properties properties = PropertiesLoaderUtils.loadProperties(resource);

            SqlSessionFactory sqlSessionFactory = getSqlSessionFactory(resource, ENVIRONMENT, properties);


            return sqlSessionFactory.openSession(Boolean.FALSE);

        }catch (Exception e){
            e.printStackTrace();
            throw new IOException("Error al obtener la sesión SQL: " + e.getMessage());
        }



    }

    private static SqlSessionFactory getSqlSessionFactory(final Resource resource, final String environment, final Properties properties) {

        SqlSessionFactory sqlSessionFactory = null;

        try {

            InputStream inputStream = resource.getInputStream();

            Reader reader = new InputStreamReader(inputStream);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, environment, properties);

        } catch (FileNotFoundException e) {

            System.out.println("Error loading MyBatis configuration file");
            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error loading MyBatis configuration file");
            e.printStackTrace();

        }
        return sqlSessionFactory;

    }



}
