package fr.takima.training.simpleapi.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@CrossOrigin
public class GreetingController {

    private static final String TEMPLATE = "Y a rien , %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "qui fonctionne") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    record Greeting(long id, String content) {
    }
}
