package com.spa.service;

import com.spa.model.Person;

import java.util.List;

/**
 * Created by johanna on 10/24/2014.
 */
public interface UserService {

    public List getUsers();
    public void save(User user);
}
