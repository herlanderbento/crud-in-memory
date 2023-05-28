package Repositories;

import Entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IRepository<Person> {
    List<Person> personRepository = new ArrayList<Person>();
    @Override
    public void save(Person entity) {
        personRepository.add(entity);
    }

    @Override
    public void delete(long id) {
        personRepository.removeIf(entity -> entity.getId() == id);
    }

    @Override
    public List<Person> list() {
        return personRepository;
    }

    @Override
    public void update(Person entity) {
        for (int index = 0; index < personRepository.size(); index++){
            Person person = personRepository.get(index);
            if (person.getId() == entity.getId()){
                personRepository.set(index, entity);
            }
        }
    }
}
