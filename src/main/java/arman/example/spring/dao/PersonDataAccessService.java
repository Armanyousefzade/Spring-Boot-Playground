package arman.example.spring.dao;

import arman.example.spring.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao{
    @Override
    public int insertPerson(final UUID id, final Person person) {
        return 0;
    }

    @Override
    public Optional<Person> selectPersonById(final UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "From postgres DB"));
    }

    @Override
    public int deletePersonById(final UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(final UUID id, final Person person) {
        return 0;
    }
}
