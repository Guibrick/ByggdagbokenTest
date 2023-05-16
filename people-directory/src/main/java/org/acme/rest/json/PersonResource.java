package org.acme.rest.json;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/people")
public class PersonResource {

    private Set<Person> people = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public PersonResource() {
        people.add(new Person(421262279, "Julio", "Spain"));
        people.add(new Person(15927859, "Maria", "Greece"));
        people.add(new Person(974573565, "Sylwia", "Poland"));
        people.add(new Person(22729745, "Paul", "Brazil"));
    }

    @GET
    public Set<Person> GetAll() {
        return people;
    }

    @POST
    public Set<Person> AddPerson(Person person) {
        people.add(new Person(person.id= new Random().nextInt(), person.name, person.country) );
        return people;
    }
}