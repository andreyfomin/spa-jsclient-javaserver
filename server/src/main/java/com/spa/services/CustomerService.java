package com.spa.services;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AFomin on 12/1/2014.
 */

@Service
public interface CustomerService<C, ID> {
    public void insertCustomer(C customer);
    public List<C> findAllCustomers();
    public C findCustomerById(ID id);
    public void deleteCustomer(C customer);
}
