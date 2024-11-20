package com.mhh.Hibernate.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @ElementCollection
    @CollectionTable(name = "image", joinColumns = @JoinColumn(name = "student_id"))
    @Column(name = "file_name")
    private Set<String> images = new HashSet<String>();
}
