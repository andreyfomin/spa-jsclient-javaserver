package com.spa.repositories;

import com.spa.model.Customer;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by johanna on 11/25/2014.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}