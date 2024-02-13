package com.proyecto.cole.spring.controllers;

import com.proyecto.cole.spring.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioConroller {
    @RequestMapping(value= "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario  = new Usuario();
        usuario.setNombre("Cole");
        usuario.setApellido("Monecinos");
        usuario.setEmail("cole@mail.com");
        usuario.setTelefono("35100020");
        usuario.setId(id);

        return usuario;

    }
}
