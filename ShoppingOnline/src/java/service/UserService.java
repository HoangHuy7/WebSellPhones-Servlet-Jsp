/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import model.TblUser;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserService {

    private final UserDao userDao;
    private final Session session;

    public UserService(Session session) {
        this.userDao = new UserDao(session);
        this.session = session;
    }

    public TblUser findByUserNameAndPasswordAndStatusAndRole(String userName, String password, byte status) {

        TblUser user = null;
        Transaction tran = null;
        try {
            tran = session.beginTransaction();
            user = userDao.findByUserNameAndPasswordAndStatusAndRole(userName, password, status);
            tran.commit();
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return user;
    }
}
