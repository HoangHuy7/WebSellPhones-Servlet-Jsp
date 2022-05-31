/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author LENOVO
 * @param <T>
 */
public interface IGenericDao<T> {

    List<T> findAll();

    T findById(Serializable id);

    boolean insert(T t);

    boolean deleteById(Serializable id);

    boolean update(T t);
}
