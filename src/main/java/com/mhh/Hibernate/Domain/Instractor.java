package com.mhh.Hibernate.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "instractor")
public class Instractor extends User {

    private double salary;

    public Instractor(Long id, String firstName, String lastName, String email, double salary) {
        super(id, firstName, lastName, email);
        this.salary = salary;
    }

}
