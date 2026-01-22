package com.pedrotxc.rest_with_spring_boot_and_java.person.service;

import com.pedrotxc.rest_with_spring_boot_and_java.exception.ResourceNotFoundException;
import com.pedrotxc.rest_with_spring_boot_and_java.person.model.Person;
import com.pedrotxc.rest_with_spring_boot_and_java.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {
        logger.info("Finding all People!");
        return repository.findAll();
    }

    public Person findById(Long id) {
        logger.info("Find one Person!");
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
    }

    public Person create(Person person) {
        logger.info("Creating one Person!");
        return repository.save(person);
    }

    public Person update(Person person) {
        logger.info("Updating one Person!");

        Person entity = this.findById(person.getId());

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return repository.save(entity);
    }

    public void delete(Long id) {
        logger.info("Deleting one Person!");

        Person entity = this.findById(id);

        repository.delete(entity);
    }

    private Person mockPerson(int i) {
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName " + i);
        person.setLastName("LastName " + i);
        person.setAddress("Address  in Brasil");
        person.setGender("Male");

        return person;
    }

}
