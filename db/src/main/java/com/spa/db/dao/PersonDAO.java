package com.spa.db.dao;

import com.spa.model.Person;

import java.util.List;

public interface PersonDAO {

    public void save(Person p);

    public List<Person> list();

}