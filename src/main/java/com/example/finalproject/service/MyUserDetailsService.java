package com.example.finalproject.service;

import com.example.finalproject.UserPrinciple;
import com.example.finalproject.model.Person;
import com.example.finalproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private PersonRepository repository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Person p=repository.findByUsername(s);
        if (p==null){
            throw new UsernameNotFoundException("user in not in db");
        }
        return new UserPrinciple(p);
    }
}
