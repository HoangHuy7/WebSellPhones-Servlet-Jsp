/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import model.TblUser;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class UserDao implements IGenericDao<TblUser>{

    private final Session session;

    public UserDao(Session session) {
        this.session = session;
    }
    
    @Override
    public List<TblUser> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TblUser findById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(TblUser t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TblUser t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public TblUser findByUserNameAndPasswordAndStatusAndRole(String userName,String password,byte status){
        
        Query query = session.createQuery("from TblUser U where U.email = :email and U.password = :pass and U.status = :sta");
        query.setParameter("email", userName);
        query.setParameter("pass", password);
        query.setParameter("sta", status);
        return (TblUser) query.list().get(0);
    }
    
}
