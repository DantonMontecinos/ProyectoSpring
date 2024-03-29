package com.proyecto.cole.spring.controllers;

import com.proyecto.cole.spring.dao.UsuarioDao;
import com.proyecto.cole.spring.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
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

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash=argon2.hash(1, 1024,1,usuario.getPassword());
        usuario.setPassword(hash);

        usuarioDao.registrar(usuario);

    }

    @RequestMapping(value= "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void Eliminar(@PathVariable Long id){

        usuarioDao.eliminar(id);

    }


}
