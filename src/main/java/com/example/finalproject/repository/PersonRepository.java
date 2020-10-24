package com.example.finalproject.repository;

import com.example.finalproject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findByUsername(String username);
}
