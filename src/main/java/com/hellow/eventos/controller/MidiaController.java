package com.hellow.eventos.controller;

import com.hellow.eventos.classes.midia.Midia;
import com.hellow.eventos.classes.midia.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Midia")
public class MidiaController {

    @Autowired
    private MidiaRepository Midiarepository;

    @GetMapping("todos")
    public List<Midia> getAllMidia(){
        return this.Midiarepository.findAll();
    }

    @PostMapping("add")
    public Midia addMidia(@RequestBody Midia midia) {
        this.Midiarepository.save(midia);
        return midia;
    }

}
