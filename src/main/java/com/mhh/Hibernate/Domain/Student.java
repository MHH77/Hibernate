package com.mhh.Hibernate.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student extends User {
    private String course;

    public Student(Long id, String firstName, String lastName, String email, String course) {
        super(id, firstName, lastName, email);
        this.course = course;
    }

}
