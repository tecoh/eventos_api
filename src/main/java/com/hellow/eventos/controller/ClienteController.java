package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository Clienterepository;

    @GetMapping("todos")
    public List<Cliente> getAllCliente(){
        return this.Clienterepository.findAll();
    }

    @PostMapping("add")
    public Cliente addTipo(@RequestBody Cliente cliente){
        this.Clienterepository.save(cliente);
        return cliente;
    }

}