package com.mhh.Hibernate.Client;

import com.mhh.Hibernate.Domain.Book;
import com.mhh.Hibernate.Domain.Chapter;
import com.mhh.Hibernate.Domain.Publisher;
import com.mhh.Hibernate.Service.BookStoreService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStoreService bookStoreService = new BookStoreService();

        //persisting object graph
        Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

        Book book = new Book("9781617290459", "Java Persistence with Hibernate ,Second Edition", publisher);

        List<Chapter> chapters = new ArrayList<Chapter>();
        Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
        chapters.add(chapter1);
        Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
        chapters.add(chapter2);

        book.setChapters(chapters);

        bookStoreService.saveBook(book);

        //retrieving object graph
        //Book book = bookStoreService.fetchByISBN("9781617290459");
        //System.out.println(book);

    }
}
