package com.spa.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;


@Entity
//@NamedQuery(
//		name="Person.findByName",
//		query="select p from Person p where lower(p.firstName) like ?1 or lower(p.lastName) like ?1")
public class Person {
	@Id
	@GeneratedValue
	private String  id;
	private String firstName;
	private String lastName;
	private String email;
	private Calendar birthday;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(String  id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
