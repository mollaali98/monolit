package com.example.java11.bootstrap;


import com.example.java11.components.author.AuthorService;
import com.example.java11.components.book.BookService;
import com.example.java11.components.publisher.PublisherService;
import com.example.java11.model.Author;
import com.example.java11.model.Book;
import com.example.java11.model.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorService authorService;
    private final BookService bookService;
    private final PublisherService publisherService;

    public BootStrapData(AuthorService authorService, BookService bookService, PublisherService publisherService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.publisherService = publisherService;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("-----Starting------");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherService.save(publisher);

        System.out.println("Publisher Count: " + publisherService.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorService.save(eric);
        bookService.save(ddd);
        publisherService.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorService.save(rod);
        bookService.save(noEJB);
        publisherService.save(publisher);

        System.out.println("Number of Books: " + bookService.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
