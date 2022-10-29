package com.example.java11.components.publisher;


import com.example.java11.model.Publisher;

public interface PublisherService {

    void save(Publisher publisher);

    Iterable<Publisher> findAll();

    long count();
}
