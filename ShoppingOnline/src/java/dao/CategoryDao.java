/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import model.TblProductcategory;
import org.hibernate.Session;


/**
 *
 * @author LENOVO
 */
public class CategoryDao implements IGenericDao<TblProductcategory>{

    private final Session session;

    public CategoryDao(Session session) {
        this.session = session;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TblProductcategory> findAll() {
        return session.createQuery("from TblProductcategory").list();
    }

    @Override
    public TblProductcategory findById(Serializable id) {
        return (TblProductcategory) session.get(TblProductcategory.class, id);
    }

    @Override
    public boolean insert(TblProductcategory t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TblProductcategory t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
