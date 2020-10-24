package com.example.finalproject.controller;

import com.example.finalproject.model.Person;
import com.example.finalproject.model.PersonRequestDto;
import com.example.finalproject.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @RequestMapping("/register")
    public ResponseEntity<Long>register(@RequestBody PersonRequestDto dto){
       try {
          Person p =personService.save(dto);
          return new ResponseEntity<>(p.getId(), HttpStatus.ACCEPTED);
       }catch (Exception e){
           return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
       }
    }
}
