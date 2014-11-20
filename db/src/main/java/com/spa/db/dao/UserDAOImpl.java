package com.spa.db.dao;

import com.spa.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AFomin on 11/20/2014.
 */

@Service
public class UserDAOImpl implements UserDAO {

    @Autowired
    private MongoOperations mongoOperation;

    @Override
    public void save(User usr) {
        mongoOperation.save(usr);
    }

    @Override
    public User findOne(Query searchUserQuery, User usr) {
        return mongoOperation.findOne(searchUserQuery, User.class);
    }

    @Override
    public List<User> list(User user) {
        return mongoOperation.findAll(User.class);
    }

    @Override
    public void updateFirst(Query searchUserQuery, Update update, User user) {
        mongoOperation.updateFirst(searchUserQuery, update, User.class);
    }

    @Override
    public void remove(Query searchUserQuery, User user) {
        mongoOperation.remove(searchUserQuery, User.class);
    }
}
