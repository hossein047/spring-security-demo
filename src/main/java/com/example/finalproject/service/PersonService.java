package com.example.finalproject.service;

import com.example.finalproject.mapper.PersonMapper;
import com.example.finalproject.model.Person;
import com.example.finalproject.model.PersonRequestDto;
import com.example.finalproject.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service

public class PersonService {

    private final PersonMapper mapper;
    private  final PersonRepository repository;

    public PersonService(PersonMapper mapper, PersonRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    public Person save(PersonRequestDto dto){
        Person p=mapper.requestToEntity(dto);
        return repository.save(p);
    }
}
