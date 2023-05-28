package Tests;

import Entity.Person;
import Repositories.PersonRepository;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Tests {
    static PersonRepository personRepository = new PersonRepository();

    public static void main(String[] args){
        insertBulkPerson();
        listPerson();
        personRepository.delete(2);
        System.out.println("-------------------------------------------");
        listPerson();
        System.out.println("-------------------------------------------");
        update();
        listPerson();
    }

    public static void update(){
        Person person = new Person(1, "Herlander de Castro", 22);
        personRepository.update(person);
    }
    public static void insertBulkPerson(){
        Person person[] = new Person[5];
        person[0] = new Person(1, "Herlander Bento", 22);
        person[1] = new Person(2, "Antonio Gabriel", 22);
        person[2] = new Person(3, "Marcia Gaieta", 21);
        person[3] = new Person(4, "Jorge Neto", 24);
        person[4] = new Person(5, "Klenio Manuel", 22);

        personRepository.save(person[0]);
        personRepository.save(person[1]);
        personRepository.save(person[2]);
        personRepository.save(person[3]);
        personRepository.save(person[4]);
    }

    public static void listPerson(){
        List<Person> list = new ArrayList<Person>();
        list = personRepository.list();

        for (Person person : list){
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
        }

    }
}
