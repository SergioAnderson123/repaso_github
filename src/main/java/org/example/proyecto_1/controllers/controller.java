package org.example.proyecto_1.controllers;

public class controller {
    @org.springframework.web.bind.annotation.GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot,!";
    }

}
