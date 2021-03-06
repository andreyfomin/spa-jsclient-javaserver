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
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AFomin on 9/14/2014.
 */

@RestController
//@Secured({"ROLE_ADMIN"})
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    @Qualifier("customerServiceJpaImpl")
    private CustomerService customerService;
    @PreAuthorize(value="hasRole('ROLE_ADMIN') and hasRole('ROLE_USER')")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerService.findAllCustomers();
    }


    /**
     *
     * SELECT * FROM CUSTOMER OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;
     *
     * @param reqMessage
     * @return
     */
    @RequestMapping(value = "/page/list", method = RequestMethod.POST)
    @PreAuthorize(value="hasRole('ROLE_USER')")
    @ResponseStatus(HttpStatus.OK)
    public SrvSideTableParamResMessage getServerSideProcessedCustomers(@RequestBody SrvSideTableParamReqMessage reqMessage) {
        SrvSideTableParamResMessage srvSideTableParamResMessage = new SrvSideTableParamResMessage();

        final Page allCustomers = customerService.findAllCustomers(
                new PageRequest(
                        reqMessage.getStart() / reqMessage.getLength(),
                        reqMessage.getLength(),
                        reqMessage.getSortingOrder(),
                        reqMessage.getSortingOrderColName())
        );

        srvSideTableParamResMessage.setData(allCustomers.getContent());
        srvSideTableParamResMessage.setRecordsTotal((int) allCustomers.getTotalElements());
        srvSideTableParamResMessage.setRecordsFiltered((int) allCustomers.getTotalElements());
        srvSideTableParamResMessage.setDraw(reqMessage.getDraw());

        return srvSideTableParamResMessage;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@RequestBody Customer customer) {
        return (Customer) customerService.insertCustomer(customer);
    }

}
