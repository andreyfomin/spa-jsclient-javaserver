package com.spa.mongodb.repositories;

import com.spa.mongodb.models.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/database-config.xml"})
@ActiveProfiles(profiles = "mongo_repository")
public class PersonRepositoryTest {
    @Autowired
    PersonRepository personRepository;

    Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("Andrey","Fomin");
    }

    @Test
    public void testSave() throws Exception {
        Person result = personRepository.save(person);
        Assert.assertThat(result.getId(), is(notNullValue()));
    }
}