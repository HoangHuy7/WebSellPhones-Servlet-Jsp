/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import model.TblProduct;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class ProductDao implements IGenericDao<TblProduct>{

    private final Session session;

    public ProductDao(Session session) {
        this.session = session;
    }
    
    @Override
    public List<TblProduct> findAll() {
        return session.createQuery("from TblProduct").list();
    }

    @Override
    public TblProduct findById(Serializable id) {
        return (TblProduct) session.get(TblProduct.class, id);
    }

    @Override
    public boolean insert(TblProduct t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TblProduct t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
