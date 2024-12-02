package com.mhh.Hibernate.Domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue(value = "INSTRUCTOR")
public class Instructor extends User {

    private double salary;

    public Instructor(String firstName, String lastName, String email, double salary) {
        super(firstName, lastName, email);
        this.salary = salary;
    }

}