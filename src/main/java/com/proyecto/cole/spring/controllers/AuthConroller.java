package com.proyecto.cole.spring.controllers;

import com.proyecto.cole.spring.dao.UsuarioDao;
import com.proyecto.cole.spring.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthConroller {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value= "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){

        if (usuarioDao.verificarCredenciales(usuario)){
            return "OK";
        }
        return "FAIL";

    }
}
