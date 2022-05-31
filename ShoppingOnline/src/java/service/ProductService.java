/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProductDao;
import java.util.List;
import model.TblProduct;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LENOVO
 */
public class ProductService {

    private final ProductDao prodDao;
    private final Session session;

    public ProductService(Session session) {
        this.prodDao = new ProductDao(session);
        this.session = session;
    }

    public List<TblProduct> findAll() {
        
        List<TblProduct> listProduct = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            listProduct = prodDao.findAll();
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return listProduct;
    }
    public TblProduct findById(int id) {
        TblProduct product = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            product = prodDao.findById(id);
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return product;
    }

}
