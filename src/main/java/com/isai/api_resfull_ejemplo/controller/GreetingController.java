package com.isai.api_resfull_ejemplo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

import com.isai.api_resfull_ejemplo.entity.Greeting;

@RestController
public class GreetingController {

    // atributos
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    // peticion de tipo get el cual recibe varios parametros
    @GetMapping("/greeting")
    public Greeting saludar(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
