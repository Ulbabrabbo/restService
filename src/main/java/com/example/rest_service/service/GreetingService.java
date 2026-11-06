package com.example.rest_service.service;


import com.example.rest_service.data.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private static final String template = "Ciao %s!";

    public Greeting salutoBase(){
        return new Greeting("Ciao Mondo!");
    }

    public Greeting salutoPersonalizzato(String name){
        return new Greeting(template.formatted(name) );
    }
}
