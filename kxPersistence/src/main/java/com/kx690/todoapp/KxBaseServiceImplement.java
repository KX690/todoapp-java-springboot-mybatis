package com.kx690.todoapp;

import java.util.List;

public interface KxBaseServiceImplement<T> {

    List<T> getAll();
    T getById(Long id);
    T save(T entity);
    T update(T entity);
    Boolean delete(T entity);

}
