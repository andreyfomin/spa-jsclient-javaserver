package com.spa.service;

import com.spa.model.Person;

import java.util.List;

/**
 * Created by johanna on 10/24/2014.
 */
public interface PersonService {

    public List getPersons();
    public void save(Person person);
}
