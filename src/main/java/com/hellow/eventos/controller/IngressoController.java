package com.hellow.eventos.controller;

import com.hellow.eventos.classes.ingresso.Ingresso;
import com.hellow.eventos.classes.ingresso.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Ingresso")
public class IngressoController {

    @Autowired
    private IngressoRepository Ingressorepository;

    @GetMapping("todos")
    public List<Ingresso> getAllIngresso(){
        return this.Ingressorepository.findAll();
    }

    @PostMapping("add")
    public Ingresso addIngresso(@RequestBody Ingresso ingresso) {
        this.Ingressorepository.save(ingresso);
        return ingresso;
    }

}