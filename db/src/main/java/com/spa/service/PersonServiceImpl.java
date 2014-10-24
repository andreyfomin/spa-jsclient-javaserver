package com.spa.service;

import com.spa.db.dao.PersonDAO;
import com.spa.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by johanna on 10/24/2014.
 */

@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {

    @Autowired
    protected PersonDAO personDAO;

    @Override
    public List getPersons() {
        return this.personDAO.list();
    }

    @Transactional(readOnly = false)
    @Override
    public void save(Person person) {
        personDAO.save(person);
    }
}
