package com.example.java11.controllers;


import com.example.java11.components.publisher.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping("/publishers")
    public String getPublishers(Model model) {

        model.addAttribute("publishers", publisherService.findAll());

        return "publishers/list";
    }
}
