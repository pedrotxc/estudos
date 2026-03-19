package com.pedrotxc.rest_with_spring_boot_and_java.person.service;

import com.pedrotxc.rest_with_spring_boot_and_java.exception.ResourceNotFoundException;
import com.pedrotxc.rest_with_spring_boot_and_java.person.data.dto.PersonDTO;
import com.pedrotxc.rest_with_spring_boot_and_java.person.model.Person;
import com.pedrotxc.rest_with_spring_boot_and_java.person.repository.PersonRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static com.pedrotxc.rest_with_spring_boot_and_java.person.mapper.ObjectMapper.parseListObjects;
import static com.pedrotxc.rest_with_spring_boot_and_java.person.mapper.ObjectMapper.parseObject;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    private final AtomicLong counter = new AtomicLong();
    private org.slf4j.Logger logger = LoggerFactory.getLogger(PersonService.class.getName());

    public List<PersonDTO> findAll() {
        logger.info("Finding all People!");
        return parseListObjects(repository.findAll(), PersonDTO.class);
    }

    public PersonDTO findById(Long id) {
        logger.info("Find one Person!");
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        return parseObject(entity, PersonDTO.class);
    }

    public PersonDTO create(PersonDTO person) {
        logger.info("Creating one Person!");
        Person entity = parseObject(person, Person.class);
        return parseObject(repository.save(entity), PersonDTO.class);
    }

    public PersonDTO update(PersonDTO person) {
        logger.info("Updating one Person!");
        var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return parseObject(repository.save(entity), PersonDTO.class);
    }

    public void delete(Long id) {
        logger.info("Deleting one Person!");

        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

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
