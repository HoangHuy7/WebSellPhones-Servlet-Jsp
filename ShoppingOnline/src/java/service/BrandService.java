/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.BrandDao;
import java.util.List;
import model.TblBrand;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LENOVO
 */
public class BrandService {
    private final BrandDao brandDao;
    private final Session session;

    public BrandService(Session session) {
        this.brandDao = new BrandDao(session);
        this.session = session;
    }

    public List<TblBrand> findAll() {

        List<TblBrand> list = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            list = brandDao.findAll();
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return list;
    }

    public TblBrand findById(int id) {
        TblBrand product = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            product = brandDao.findById(id);
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return product;
    }
}
