package org.acme.rest.json;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/people")
public class PersonResource {

    private Set<Person> people = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public PersonResource() {
        people.add(new Person(01, "John", "France"));
        people.add(new Person(02, "Paula", "India"));
    }

    @GET
    public Set<Person> list() {
        return people;
    }

    @POST
    public Set<Person> add(Person person) {
        people.add(person);
        return people;
    }

    @DELETE
    public Set<Person> delete(Person person) {
        people.removeIf(existingPerson -> existingPerson.equals(person.id));
        return people;
    }
}
