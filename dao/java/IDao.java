package com.example.pizzaapp.dao;
import java.util.*;

public interface IDao<T> {

    void create(T o);
    void delete(T o);
    void update(T o);
    T findById(int id);
    List<T> findAll();

}
