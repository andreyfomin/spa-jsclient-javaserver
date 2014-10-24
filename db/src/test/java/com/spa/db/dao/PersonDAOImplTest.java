package com.spa.db.dao;

import com.spa.model.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:spring/database-config-test.xml"})
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonDAOImplTest {

    @Autowired
    PersonDAO personDAO;

    Person person;

    @Before
    public void setUp() throws Exception {

        person =  new Person();
        person.setName("Andrey Fomin");
        person.setCountry("USA");

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSetSessionFactory() throws Exception {

    }

    @Test
    public void testSave() throws Exception {

        personDAO.save(person);
        assertNotNull("Person was no saved!", person.getId());

    }

    @Test
    public void testList() throws Exception {

        personDAO.save(person);
        assertEquals("Person was no loaded!", 1,  personDAO.list().size());

    }
}