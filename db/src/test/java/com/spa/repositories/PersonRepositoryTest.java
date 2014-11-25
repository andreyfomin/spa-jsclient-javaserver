package com.spa.repositories;

import com.spa.models.Person;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/database-config.xml"})
@ActiveProfiles(profiles = "jpa_repository")
public class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    Person person;

    @org.junit.Before
    public void setUp() throws Exception {

        person = new Person();
        person.setFirstName("Andrey");
        person.setLastName("Fomin");
    }

    @org.junit.Test
    public void testFindByName() throws Exception {

        personRepository.save(person);

    }
}