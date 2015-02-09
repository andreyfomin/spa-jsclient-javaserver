package com.spa.jpa.models;

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
    private Long id;

    private String firstName, lastName;

    @Column(unique = true)
    private EmailAddress emailAddress;

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

    /**
     * Adds the given {@link Address} to the {@link Customer}.
     *
     * @param address must not be {@literal null}.
     */
    public void add(Address address) {

        Assert.notNull(address);
        this.addresses.add(address);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the firstName of the {@link Customer}.
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the lastName of the {@link Customer}.
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the lastName of the {@link Customer}.
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the {@link EmailAddress} of the {@link Customer}.
     *
     * @return
     */
    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the {@link Customer}'s {@link EmailAddress}.
     *
     * @param emailAddress must not be {@literal null}.
     */
    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Return the {@link Customer}'s addresses.
     *
     * @return
     */
    public Set<Address> getAddresses() {
        return Collections.unmodifiableSet(addresses);
    }

}
