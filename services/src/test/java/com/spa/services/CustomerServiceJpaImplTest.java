package com.spa.services;

import com.spa.jpa.models.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by AFomin on 6/22/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spa-services-config.xml"})
@Transactional
public class CustomerServiceJpaImplTest {

    @Autowired
    CustomerService service;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInsertCustomer() throws Exception {

    }

    @Test
    public void testFindAllCustomers() throws Exception {

    }

    @Test
    public void testFindAllCustomersByPage() throws Exception {

        final Page<Customer> allCustomers = service.findAllCustomers(new PageRequest(0, 10));
        allCustomers.getContent();
        Assert.assertThat(allCustomers.getContent(), is(notNullValue()));

    }

    @Test
    public void testDeleteCustomer() throws Exception {

    }

    @Test
    public void testFindCustomerById() throws Exception {

    }
}