package com.kx690.todoapp;

import com.kx690.todoapp.model.KXUser;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class KXUsersService implements KXBaseServiceImplement<KXUser> {


    @Override
    public List<KXUser> getAll() {
        List<KXUser> users = null;

        try{
            SqlSession session = null;
            session = KXSqlSessionFactory.getSqlSession();

            users = session.selectList("users.getAll");


        } catch(Exception e){
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public KXUser getById(Long id) {
        return null;
    }

    @Override
    public KXUser save(KXUser entity) {


        SqlSession session = null;

        try{

            session = KXSqlSessionFactory.getSqlSession();
            session.insert("users.insert", entity);


            session.commit();

        } catch(Exception e){

            throw new RuntimeException(e);

        } finally {

            if(session != null){
                session.close();
            }

        }
        return entity;
    }

    @Override
    public KXUser update(KXUser entity) {
        return null;
    }

    @Override
    public Boolean delete(KXUser entity) {
        return null;
    }
}
