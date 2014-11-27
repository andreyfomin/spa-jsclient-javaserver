package com.spa.jpa.repositories;

import com.spa.jpa.models.Customer;
import com.spa.jpa.models.EmailAddress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by AFomin on 11/27/2014.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByEmailAddress(EmailAddress email);
}
