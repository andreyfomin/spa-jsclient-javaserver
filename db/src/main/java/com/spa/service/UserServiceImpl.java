package com.spa.service;

import com.spa.db.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by AFomin on 11/20/2014.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List getUsers() {
        return null;
    }

    @Override
    public void save(User user) {

    }
}
