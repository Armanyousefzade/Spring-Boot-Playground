package arman.example.spring.dao;

import arman.example.spring.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(final UUID id, final Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
