/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.SupplierDao;
import java.util.List;
import model.TblSupplier;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LENOVO
 */
public class SupplierService {
    private final SupplierDao supplierDao;
    private final Session session;

    public SupplierService(Session session) {
        this.supplierDao = new SupplierDao(session);
        this.session = session;
    }

    public List<TblSupplier> findAll() {

        List<TblSupplier> list = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            list = supplierDao.findAll();
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return list;
    }

    public TblSupplier findById(int id) {
        TblSupplier product = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            product = supplierDao.findById(id);
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return product;
    }
}
