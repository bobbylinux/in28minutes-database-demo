package com.in28minutes.database.databasedemo.bean;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String location;
    private Date birthDate;

    public Person() {}

    public Person(int id, String name, String location, Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("\nPerson [id=%s, name=%s, location=%s, birthDate=%s]", id, name, location, String.valueOf(birthDate));
    }
}
