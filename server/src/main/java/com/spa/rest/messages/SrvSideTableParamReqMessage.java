package com.spa.rest.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFomin on 6/22/2015.
 * <p/>
 * https://datatables.net/manual/server-side
 * https://datatables.net/forums/discussion/26699/post-datatable-data-to-server-in-json-format-with-column-names
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

    @Getter
    @Setter
    private List<Column> columns = new ArrayList<Column>();

    public Sort.Direction getSortingOrder() {
        return ("asc".equals(order.get(0).getDir())) ? Sort.Direction.ASC : Sort.Direction.DESC;
    }

    public String getSortingOrderColName() {
        return columns.get(order.get(0).getColumn().intValue()).getData();
    }
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Order {
    @Getter
    @Setter
    private Long column;

    @Getter
    @Setter
    private String dir;

}

class Column {

    @Getter
    @Setter
    private String data;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Boolean searchable;

    @Getter
    @Setter
    private Boolean orderable;

    @Getter
    @Setter
    private Search search;

}

@JsonIgnoreProperties(ignoreUnknown = true)
class Search {
    @Getter
    @Setter
    private String value;

    @Getter
    @Setter
    private Boolean regex;
}
