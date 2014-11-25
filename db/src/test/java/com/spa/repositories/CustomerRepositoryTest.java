package com.spa.repositories;

import com.spa.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/database-config-test2.xml"})
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void savesAndFindsCustomerByEmailAddress() {
        Customer dave = new Customer("Dave", "Matthews");
        Customer result = customerRepository.save(dave);

    }

}