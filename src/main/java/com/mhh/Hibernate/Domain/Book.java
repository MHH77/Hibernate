package com.mhh.Hibernate.Domain;

import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String isbn;
    private String name;
    private Publisher publisher;
    private List<Chapter> chapters;


    public Book(String isbn, String name, Publisher publisher) {
        this.isbn = isbn;
        this.name = name;
        this.publisher = publisher;
    }

}
