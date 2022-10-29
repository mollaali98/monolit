package com.example.java11.components.book;


import com.example.java11.model.Book;

public interface BookService {

    void save(Book book);

    Iterable<Book> findAll();

    long count();
}
