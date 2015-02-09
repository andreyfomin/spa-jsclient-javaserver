package com.spa.jpa.repositories;

import com.spa.jpa.models.Customer;
import com.spa.jpa.models.EmailAddress;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by AFomin on 11/27/2014.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmailAddress(EmailAddress email);
}
