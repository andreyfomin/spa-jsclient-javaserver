package com.spa.mongodb.repositories;

import com.spa.mongodb.models.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
