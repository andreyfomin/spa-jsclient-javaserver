package com.spa.db.dao;


import com.spa.service.User;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public interface UserDAO {

    public void save(User usr);

    public User findOne(Query searchUserQuery, User usr);

    public List<User> list(User user);

    public void updateFirst(Query searchUserQuery, Update update ,User user);

    public void remove(Query searchUserQuery, User user);
}