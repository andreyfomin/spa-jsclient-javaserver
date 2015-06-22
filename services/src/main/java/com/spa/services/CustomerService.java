package com.spa.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by AFomin on 12/1/2014.
 */
public interface CustomerService<C, ID> {
    public C insertCustomer(C customer);

    public List<C> findAllCustomers();

    public Page<C> findAllCustomers(PageRequest var1);

    public C findCustomerById(ID id);

    public void deleteCustomer(C customer);
}
