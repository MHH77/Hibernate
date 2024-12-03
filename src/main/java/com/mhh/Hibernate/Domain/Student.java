package com.mhh.Hibernate.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Student extends User {
    private String course;

    public Student( String firstName, String lastName, String email, String course) {
        super(firstName, lastName, email);
        this.course = course;
    }

}
