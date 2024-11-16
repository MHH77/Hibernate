package com.mhh.Hibernate.Domain;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private String isbn;
    private String name;
    private Publisher publisher;
    private List<Chapter> chapters;
}
