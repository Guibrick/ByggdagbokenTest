package org.acme.rest.json;

public class Person {

    public int id;
    public String name;
    public String country;

    public Person() {
    }

    public Person(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}