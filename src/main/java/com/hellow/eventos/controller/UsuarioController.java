package com.hellow.eventos.controller;

import com.hellow.eventos.classes.usuario.Usuario;
import com.hellow.eventos.classes.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository Usuariorepository;

    @GetMapping("todos")
    public List<Usuario> getAllFornecedor(){
        return this.Usuariorepository.findAll();
    }

    @PostMapping("add")
    public Usuario addUsuario(@RequestBody Usuario usuario) {
        this.Usuariorepository.save(usuario);
        return usuario;
    }

}