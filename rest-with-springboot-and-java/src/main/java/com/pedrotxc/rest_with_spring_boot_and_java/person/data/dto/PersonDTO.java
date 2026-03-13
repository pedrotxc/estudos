package com.pedrotxc.rest_with_spring_boot_and_java.person.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {

    private static final long serialVersionUUID = 1l;

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

}
