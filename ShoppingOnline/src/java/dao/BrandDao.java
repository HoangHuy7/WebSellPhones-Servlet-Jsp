/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import model.TblBrand;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class BrandDao implements IGenericDao<TblBrand>{
    private final Session session;

    public BrandDao(Session session) {
        this.session = session;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TblBrand> findAll() {
        return session.createQuery("from TblBrand").list();
    }

    @Override
    public TblBrand findById(Serializable id) {
        return (TblBrand) session.get(TblBrand.class, id);
    }

    @Override
    public boolean insert(TblBrand t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TblBrand t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
