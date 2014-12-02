package com.util;

/**
 * Created by AFomin on 12/2/2014.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 * Provides an implementation of Jackson's {@link ObjectMapper object mapper contract}, which
 * makes it aware of Hibernate's lazy collections, which it prunes before rendering.
 */
public class HibernateAwareObjectMapper extends ObjectMapper {
//    public HibernateAwareObjectMapper() {
//        Hibernate4Module hm = new Hibernate4Module();
//        registerModule(hm);
//
//        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//    }
//
//    public void setPrettyPrint(boolean prettyPrint) {
//        configure(SerializationFeature.INDENT_OUTPUT, prettyPrint);
//    }
}