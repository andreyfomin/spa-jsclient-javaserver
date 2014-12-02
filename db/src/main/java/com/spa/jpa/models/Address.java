package com.spa.jpa.models;

import org.dom4j.tree.AbstractEntity;
import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by AFomin on 11/27/2014.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String street, city, country;

    /**
     * Creates a new {@link Address} from the given street, city and country.
     *
     * @param street  must not be {@literal null} or empty.
     * @param city    must not be {@literal null} or empty.
     * @param country must not be {@literal null} or empty.
     */
    public Address(String street, String city, String country) {

        Assert.hasText(street, "Street must not be null or empty!");
        Assert.hasText(city, "City must not be null or empty!");
        Assert.hasText(country, "Country must not be null or empty!");

        this.street = street;
        this.city = city;
        this.country = country;
    }

    protected Address() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the street.
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     * Returns the city.
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the country.
     *
     * @return
     */
    public String getCountry() {
        return country;
    }
}
