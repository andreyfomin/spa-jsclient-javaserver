package com.spa.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by AFomin on 11/20/2014.
 */
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;

    private String password;

    //getter, setter, toString, Constructors

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
