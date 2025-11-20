package com.kx690.todoapp;

import com.kx690.todoapp.model.KXTask;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class KXTasksService implements KXBaseServiceImplement<KXTask> {


    @Override
    public List<KXTask> getAll() {

        List<KXTask> tasks= null;
        SqlSession sqlSession = null;

        try{

            sqlSession = KXSqlSessionFactory.getSqlSession();

            tasks = sqlSession.selectList("tasks.getAll");


        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return tasks;
    }

    @Override
    public KXTask getById(Long id) {
        return null;
    }

    @Override
    public KXTask save(KXTask entity) {

        SqlSession sqlSession = null;

        try{

            sqlSession = KXSqlSessionFactory.getSqlSession();

            sqlSession.insert("tasks.insertTask", entity);
            sqlSession.commit();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return entity;
    }

    @Override
    public KXTask update(KXTask entity) {
        return null;
    }

    @Override
    public Boolean delete(KXTask entity) {
        return null;
    }
}
