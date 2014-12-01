package com.spa.services;

import com.spa.jpa.models.Customer;

import java.util.List;

/**
 * Created by AFomin on 12/1/2014.
 */
public class CustomerServiceJpaImpl implements CustomerService<Customer, Long> {
    @Override
    public void insertCustomer(Customer customer) {

    }

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }

    @Override
    public void deleteCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomerById(Long id) {
        return null;
    }
}
