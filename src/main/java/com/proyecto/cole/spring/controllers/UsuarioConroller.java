package com.proyecto.cole.spring.controllers;

import com.proyecto.cole.spring.dao.UsuarioDao;
import com.proyecto.cole.spring.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value= "api/usuarios")
    public List<Usuario> getUsuarios(){

        return usuarioDao.getUsuarios();

    }

    @RequestMapping(value= "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void Eliminar(@PathVariable Long id){

        usuarioDao.eliminar(id);

    }


}
