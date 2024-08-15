package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository Enderecorepository;

    @GetMapping("todos")
    public List<Endereco> getAllEndereco(){
        return this.Enderecorepository.findAll();
    }

    @PostMapping("add")
    public Endereco addEndereco(@RequestBody Endereco endereco) {
        this.Enderecorepository.save(endereco);
        return endereco;
    }

}