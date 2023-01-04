package com.alem.springmongo.entity;

import lombok.Data;
import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document()
public class Student {
    @Id
    private String _id;
    private String firstName;
    private String lastName;
    private Gender gender;
    @Indexed(unique = true)
    private String email;
    private Address address;
    private LocalDateTime created;

    public Student(String firstName, String lastName, Gender gender,String email, Address address, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.created = created;
    }
}
