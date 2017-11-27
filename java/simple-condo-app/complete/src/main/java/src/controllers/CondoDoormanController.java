package src.controllers;

import src.models.CondoDoorman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CondoDoormanController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/doorman")
    public CondoDoorman condoDoorman(){
        return new CondoDoorman(
               1,
               "Pedro Cordeiro",
               "27622870900",
               1000.00);
    }
}
