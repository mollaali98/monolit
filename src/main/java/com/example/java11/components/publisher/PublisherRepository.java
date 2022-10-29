package com.example.java11.components.publisher;

import com.example.java11.model.Publisher;
import org.springframework.data.repository.CrudRepository;

interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
