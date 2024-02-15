package com.proyecto.cole.spring.controllers;

import com.proyecto.cole.spring.dao.UsuarioDao;
import com.proyecto.cole.spring.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioConroller {

    @Autowired
    private UsuarioDao usuarioDao;



    @RequestMapping(value= "api/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

       return null;

    }

    @RequestMapping(value= "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){

        return usuarioDao.getUsuarios();

    }

    @RequestMapping(value= "api/usuarios", method = RequestMethod.POST)
    public void RegistrarUsuario(@RequestBody Usuario usuario){

        usuarioDao.registrar(usuario);

    }

    @RequestMapping(value= "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void Eliminar(@PathVariable Long id){

        usuarioDao.eliminar(id);

    }


}
