package com.case1;

import java.util.Objects;

/**
 CASE 1
 - Kasusnya misalnya kita membuat sebuah class model dengan nama class Person (id:String, name:String).
 - Selanjutnya kita punya interface PersoonRepository sebagai interaksi antara program ke database,
 dan memiliki function selectBy(id:String) untuk mendapatkan data Person pada database.
 - Dan terakhir kita memiliki class PersonService yang digunakan sebagai class bisnis logic, dimana di class tersebut kita
 akan coba gunakan PersonRepository untuk mendapatkan data dari database, jika gagal, kita akan throw Exception.
 */
public class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
