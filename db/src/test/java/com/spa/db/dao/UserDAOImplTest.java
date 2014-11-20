package com.spa.db.dao;

import com.spa.model.Person;
import com.spa.service.User;
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
public class UserDAOImplTest {

    @Autowired
    UserDAO userDAO;

    User user;


    @Before
    public void setUp() throws Exception {

        user = new User();
        user.setUsername("Andrey Fomin");
        user.setPassword("1q2w3e4r5t");

    }

    @Test
    public void testSave() throws Exception {

        userDAO.save(user);

    }

    @Test
    public void testFindOne() throws Exception {

    }

    @Test
    public void testList() throws Exception {

    }

    @Test
    public void testUpdateFirst() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }
}