package com.spa.rest;

import com.spa.jpa.models.Customer;
import com.spa.rest.messages.SrvSideTableParamReqMessage;
import com.spa.rest.messages.SrvSideTableParamResMessage;
import com.spa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Customer> getCustomers() {
        return customerService.findAllCustomers();
    }

    @RequestMapping(value = "/page/list", method = RequestMethod.POST)
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public
//    @ResponseBody
    SrvSideTableParamResMessage getServerSideProcessedCustomers(@RequestBody SrvSideTableParamReqMessage reqMessage) {
        SrvSideTableParamResMessage srvSideTableParamResMessage = new SrvSideTableParamResMessage();

        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Alon", "XXXXX"));

        final Page<Customer> allCustomers = customerService.findAllCustomers(
                new PageRequest(reqMessage.getStart()/reqMessage.getLength(), reqMessage.getLength()));

        srvSideTableParamResMessage.setData(allCustomers.getContent());
        srvSideTableParamResMessage.setRecordsTotal((int)allCustomers.getTotalElements());
        srvSideTableParamResMessage.setRecordsFiltered((int)allCustomers.getTotalElements());
        srvSideTableParamResMessage.setDraw(reqMessage.getDraw());

        return srvSideTableParamResMessage;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public
//    @ResponseBody
    Customer updateCustomer(@RequestBody Customer customer) {
        return (Customer) customerService.insertCustomer(customer);
    }

}
