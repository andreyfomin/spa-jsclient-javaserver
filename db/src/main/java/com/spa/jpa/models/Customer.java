package com.spa.jpa.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by AFomin on 11/27/2014.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    @Column(unique = true)
    private EmailAddress emailAddress;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Set<Address> addresses = new HashSet<Address>();

    /**
     * Creates a new {@link Customer} from the given firstName and lastName.
     *
     * @param firstName must not be {@literal null} or empty.
     * @param lastName  must not be {@literal null} or empty.
     */
    public Customer(String firstName, String lastName) {

        Assert.hasText(firstName);
        Assert.hasText(lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected Customer() {

    }

}
