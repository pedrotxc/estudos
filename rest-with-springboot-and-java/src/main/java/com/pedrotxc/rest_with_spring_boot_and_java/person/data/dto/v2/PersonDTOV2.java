package com.pedrotxc.rest_with_spring_boot_and_java.person.data.dto.v2;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonDTOV2 {

    private static final long serialVersionUUID = 1l;

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDay;
    private String address;
    private String gender;

}
