/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CategoryDao;
import java.util.List;
import model.TblProductcategory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LENOVO
 */
public class CategoryService {

    private final CategoryDao CateDao;
    private final Session session;

    public CategoryService(Session session) {
        this.CateDao = new CategoryDao(session);
        this.session = session;
    }

    public List<TblProductcategory> findAll() {

        List<TblProductcategory> list = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            list = CateDao.findAll();
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return list;
    }

    public TblProductcategory findById(Integer id) {
        TblProductcategory product = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            product = CateDao.findById(id);
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return product;
    }
}
