/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import model.TblSupplier;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class SupplierDao implements IGenericDao<TblSupplier>{
    private final Session session;

    public SupplierDao(Session session) {
        this.session = session;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TblSupplier> findAll() {
        return session.createQuery("from TblSupplier").list();
    }

    @Override
    public TblSupplier findById(Serializable id) {
        return (TblSupplier) session.get(TblSupplier.class, id);
    }

    @Override
    public boolean insert(TblSupplier t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TblSupplier t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
