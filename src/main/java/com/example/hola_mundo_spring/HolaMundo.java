package com.example.hola_mundo_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    @GetMapping("/holii")
    public String hola() {
        return "<h1>Hola Mundo<h1>";
    }
}
