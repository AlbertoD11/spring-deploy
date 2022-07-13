package com.example.ejercicio101112;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${app.varexample")
    String message;


    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo que tal vamos!!! Hasta luego!";
    }
}
