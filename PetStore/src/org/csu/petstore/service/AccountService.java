package org.csu.petstore.service;

import org.csu.petstore.domain.Cart;
import org.csu.petstore.domain.UserInfo;
import org.csu.petstore.persistence.UserDAO;
import org.csu.petstore.persistence.imple.UserDAOImple;

public class AccountService {
    private UserInfo userInfo = null;
    private UserDAO userDao=null;

    public AccountService(){
        userDao=new UserDAOImple();
    }
    public UserInfo login(UserInfo userInfo){
        userInfo = userDao.login(userInfo);
        return userInfo;
    }

    public boolean register(UserInfo userInfo){
        return userDao.register(userInfo);
    }
    public UserInfo signIn(){
        return null;
    }
    public Cart getCart(){
        return null;
    }
    public boolean changeCart(){
        return true;
    }
}
