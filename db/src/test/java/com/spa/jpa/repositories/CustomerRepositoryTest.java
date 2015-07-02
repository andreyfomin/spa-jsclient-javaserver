package com.spa.jpa.repositories;

import com.spa.jpa.models.Address;
import com.spa.jpa.models.Customer;
import com.spa.jpa.models.EmailAddress;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/database-no-profile-config.xml"})
@Transactional
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    Customer customer;

    @Before
    @Rollback(false)
    public void setUp() throws Exception {

        customer = new Customer("Andrey", "Fomin");
        customer.setEmailAddress(new EmailAddress("andrey.fomin@mail.ru"));
        customer.getAddresses().add(new Address("Kaplinsky", "Rishon", "Israel"));
    }

    @Test
    @Rollback(false)
    public void testSaveCustomer() throws Exception {
        Customer result = customerRepository.save(customer);
        Assert.assertThat(result.getId(), is(notNullValue()));
    }

    @Test
    public void testFindByEmailAddress() throws Exception {

    }

    @Test
    public void testFindCustomers() throws Exception {
        List<Customer> customers = (List<Customer>) customerRepository.findAll();
        Assert.assertThat(customers, is(notNullValue()));
    }

    @Test
    public void testFindCustomersPyPage() throws Exception {
        Page<Customer> customers = customerRepository.findAll(new PageRequest(new Integer(0), new Integer(10)));
        Assert.assertThat(customers, is(notNullValue()));
    }
}