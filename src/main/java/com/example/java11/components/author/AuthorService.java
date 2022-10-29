package com.example.java11.components.author;

import com.example.java11.model.Author;

public interface AuthorService {

    void save(Author author);

    Iterable<Author> findAll();

    long count();
}
