package com.proyecto.cole.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioConroller {
    @RequestMapping(value= "prueba")
    public String prueba(){
        return "prueba";

    }
}
