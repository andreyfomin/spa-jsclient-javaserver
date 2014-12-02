package com.spa.rest;

import com.spa.jpa.models.Customer;
import com.spa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by AFomin on 9/14/2014.
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    @Qualifier("customerServiceJpaImpl")
    private CustomerService customerService;

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public @ResponseBody
    List<Customer> getClients() {
        return customerService.findAllCustomers();
    }

}
