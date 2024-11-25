package com.mhh.Hibernate.Domain;

import com.mhh.Hibernate.utils.ImageNameComparator;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SortComparator;

import java.util.*;

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
    @CollectionTable(name = "image")
    @MapKeyColumn(name = "file_name")// defne map key
    @SortComparator(ImageNameComparator.class)
    @Column(name = "image_name")// define map value
    private Map<String, String> images = new TreeMap<>();
}
