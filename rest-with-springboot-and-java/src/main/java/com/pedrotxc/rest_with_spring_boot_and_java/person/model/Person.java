package com.pedrotxc.rest_with_spring_boot_and_java.person.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Person implements Serializable {

    private static final long serialVersionUUID = 1l;

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

}
