package com.case1;

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
}
