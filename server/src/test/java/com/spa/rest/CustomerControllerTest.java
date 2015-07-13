package com.spa.rest;

import com.spa.rest.messages.SrvSideTableParamReqMessage;
import com.spa.rest.messages.SrvSideTableParamResMessage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by AFomin on 6/22/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spa-web-server-config.xml"})
public class CustomerControllerTest {

    @Autowired
    CustomerController controller;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetCustomers() throws Exception {

    }

    @Test
    public void testGetServerSideProcessedCustomers() throws Exception {

        SrvSideTableParamReqMessage reqMessage = new SrvSideTableParamReqMessage();

        reqMessage.setStart(0);
        reqMessage.setLength(10);

        final SrvSideTableParamResMessage serverSideProcessedCustomers = controller.getServerSideProcessedCustomers(reqMessage);

        Assert.assertThat(serverSideProcessedCustomers, is(notNullValue()));
    }

    @Test
    public void testUpdateCustomer() throws Exception {

    }
}