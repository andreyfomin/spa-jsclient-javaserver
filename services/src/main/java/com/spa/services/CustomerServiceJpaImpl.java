package com.spa.services;

import com.spa.jpa.models.Customer;
import com.spa.jpa.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by AFomin on 12/1/2014.
 */
@Service
@Transactional
public class CustomerServiceJpaImpl implements CustomerService<Customer, Long> {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer insertCustomer(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Page<Customer> findAllCustomers(PageRequest pageable) {
        return customerRepository.findAll(pageable);
    }

    public void deleteCustomer(Customer customer) {

    }

    public Customer findCustomerById(Long id) {
        return null;
    }
}
