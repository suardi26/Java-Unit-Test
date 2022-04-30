package com.case2;

import java.util.UUID;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.selectedByid(id);

        if(person != null){
            return person;
        }else{
            throw new IllegalArgumentException("Person Not Found");
        }
    }

    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        //personRepository.insert(person);
        return person;
    }
}
