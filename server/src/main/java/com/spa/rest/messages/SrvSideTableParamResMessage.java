package com.spa.rest.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spa.jpa.models.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by AFomin on 6/22/2015.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SrvSideTableParamResMessage {

    /**
     * The draw counter that this object is a response to - from the draw parameter
     * sent as part of the data request. Note that it is strongly recommended
     * for security reasons that you cast this parameter to an integer,
     * rather than simply echoing back to the client what it sent in the draw parameter,
     * in order to prevent Cross Site Scripting (XSS) attacks.
     */
    @Getter
    @Setter
    private Integer draw;

    /**
     * Total records, before filtering (i.e. the total number of records in the database)
     *
     */
    @Getter
    @Setter
    private  Integer recordsTotal;

    /**
     * Total records, after filtering (i.e. the total number of records after filtering
     * has been applied - not just the number of records being returned for this page of data).
     */
    @Getter
    @Setter
    private Integer recordsFiltered;


    /**
     * The data to be displayed in the table. This is an array of data source objects,
     * one for each row, which will be used by DataTables. Note that this parameter's name
     * can be changed using the ajaxDT option's dataSrc property.
     */
    @Getter
    @Setter
    private List<Customer> data;


    /**
     * Optional: If an error occurs during the running of the server-side processing script,
     * you can inform the user of this error by passing back the error message to be displayed
     * using this parameter. Do not include if there is no error.
     */
    @Getter
    @Setter
    private  String error;

}
