package com.pedrotxc.rest_with_spring_boot_and_java.person.mapper.custom;

import com.pedrotxc.rest_with_spring_boot_and_java.person.data.dto.v2.PersonDTOV2;
import com.pedrotxc.rest_with_spring_boot_and_java.person.model.Person;

import java.util.Date;

public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO(Person person) {
        PersonDTOV2 dto = new PersonDTOV2();

        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthDay(new Date());

        return dto;
    }

    public Person convertDTOToEntity(PersonDTOV2 person) {
        Person entity = new Person();

        entity.setId(person.getId());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
//      entity.setBirthDay(new Date());

        return entity;
    }

}
