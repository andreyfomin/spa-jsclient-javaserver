package com.spa.rest;

import com.spa.jpa.models.Customer;
import com.spa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by AFomin on 9/14/2014.
 */

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/list")
    public List<Customer> getClients() {
        return customerService.findAllCustomers();
    }

}
