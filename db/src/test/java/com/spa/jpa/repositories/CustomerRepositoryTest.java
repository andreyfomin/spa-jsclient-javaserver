package com.spa.jpa.repositories;

import com.spa.jpa.models.Address;
import com.spa.jpa.models.Customer;
import com.spa.jpa.models.EmailAddress;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/database-config.xml"})
@ActiveProfiles(profiles = "jpa_repository")
@Transactional
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    Customer customer;

    @Before
    public void setUp() throws Exception {

        customer = new Customer("Andrey", "Fomin");
        customer.setEmailAddress(new EmailAddress("andrey.fomin@mail.ru"));
        customer.add(new Address("Kaplinsky", "Rishon", "Israel"));

    }

    @Test
    public void testSaveCustomer() throws Exception {
        Customer result = customerRepository.save(customer);
        Assert.assertThat(result.getId(), is(notNullValue()));
    }

    @Test
    public void testFindByEmailAddress() throws Exception {

    }

    @Test
    public void testFindCustomers() throws Exception {
        List<Customer> customers = (List<Customer>)customerRepository.findAll();
    }
}