package com.example.java11.components.book;

import com.example.java11.model.Book;
import org.springframework.data.repository.CrudRepository;

interface BookRepository extends CrudRepository<Book, Long> {
}
