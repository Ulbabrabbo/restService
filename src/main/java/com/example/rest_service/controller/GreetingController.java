package com.example.rest_service.controller;


import com.example.rest_service.data.Greeting;
import com.example.rest_service.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service){
        this.service = service;
    }

    @GetMapping("/api/hello")
    public Greeting getSalutoBase(){
        return service.salutoBase();
    }

    @GetMapping("/api/hello/{name}")
    public Greeting getSalutoPersonalizzato(@PathVariable String name){
        return service.salutoPersonalizzato(name);
    }

}
