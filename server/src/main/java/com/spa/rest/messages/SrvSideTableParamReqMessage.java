package com.spa.rest.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFomin on 6/22/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SrvSideTableParamReqMessage {


    /**
     * Draw counter. This is used by DataTables to ensure that the Ajax returns from server-side
     * processing requests are drawn in sequence by DataTables
     * (Ajax requests are asynchronous and thus can return out of sequence).
     * This is used as part of the draw return parameter (see below).
     */
    @Getter
    @Setter
    private Integer draw;

    /**
     * Paging first record indicator. This is the start point in
     * the current data set (0 index based - i.e. 0 is the first record).
     */
    @Getter
    @Setter
    private Integer start;

    /**
     * Number of records that the table can display in the current draw.
     * It is expected that the number of records returned will be equal to this number,
     * unless the server has fewer records to return. Note that this can be -1 to indicate
     * that all records should be returned (although that negates any benefits of server-side processing!)
     */
    @Getter
    @Setter
    private Integer length;

    @Getter
    @Setter
    private List<Order> order = new ArrayList<Order>();

}


class Order {
    @Getter
    @Setter
    private Long column;

    @Getter
    @Setter
    private String dir;


    public Order() {
    }


}
