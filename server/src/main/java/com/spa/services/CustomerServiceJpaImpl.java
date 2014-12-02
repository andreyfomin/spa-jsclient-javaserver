package com.spa.services;

import com.spa.jpa.models.Customer;
import com.spa.jpa.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by AFomin on 12/1/2014.
 */
@Service
@Qualifier("customerServiceJpaImpl")
@Transactional
public class CustomerServiceJpaImpl implements CustomerService<Customer, Long> {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void insertCustomer(Customer customer) {

    }

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public void deleteCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomerById(Long id) {
        return null;
    }
}
