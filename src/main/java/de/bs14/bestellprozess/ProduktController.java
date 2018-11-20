package de.bs14.bestellprozess;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProduktController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/produkt")
    public ProduktModel produktModel(@RequestParam(value="name", defaultValue="World") String name) {
        return new ProduktModel(counter.incrementAndGet(),
                String.format(template, name));
    }
}
