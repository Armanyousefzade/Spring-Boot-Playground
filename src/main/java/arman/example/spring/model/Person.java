package arman.example.spring.model;

import java.util.UUID;

public class Person {

    private final UUID id;
    private final String name;

    public Person(final UUID id, final String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
