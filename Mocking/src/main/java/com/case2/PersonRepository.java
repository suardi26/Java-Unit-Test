package com.case2;


public interface PersonRepository {
    Person selectedByid(String id);

    void insert(Person person);
}
