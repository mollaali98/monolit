package com.example.java11.components.publisher;

import com.example.java11.model.Publisher;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void save(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public Iterable<Publisher> findAll() {
        return publisherRepository.findAll();
    }

    @Override
    public long count() {
        return publisherRepository.count();
    }
}
