package com.spa.rest;

import com.spa.models.Person;
import com.spa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by AFomin on 9/14/2014.
 */

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/list")
    public List<Person> getPersons() {
        return personService.getPersons();
    }
}
