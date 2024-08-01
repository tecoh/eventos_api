package com.hellow.eventos.controller;

import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="tipo")
public class TipoController {

    @Autowired
    private TipoRepository tiporepository;

    @GetMapping("todos")
    public List<Tipo> getAllTipos(){
        return this.tiporepository.findAll();
    }

    @PostMapping("add")
    public Tipo addTipo(@RequestBody Tipo tipo){
        this.tiporepository.save(tipo);
        return tipo;
    }

}
