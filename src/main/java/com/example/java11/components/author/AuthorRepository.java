package com.example.java11.components.author;

import com.example.java11.model.Author;
import org.springframework.data.repository.CrudRepository;

interface AuthorRepository extends CrudRepository<Author, Long> {
}
