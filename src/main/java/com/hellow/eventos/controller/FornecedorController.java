package com.hellow.eventos.controller;

import com.hellow.eventos.classes.fornecedor.Fornecedor;
import com.hellow.eventos.classes.fornecedor.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorRepository Fornecedorrepository;

    @GetMapping("todos")
    public List<Fornecedor> getAllFornecedor(){
        return this.Fornecedorrepository.findAll();
    }

    @PostMapping("add")
    public Fornecedor addFornecedor(@RequestBody Fornecedor fornecedor) {
        this.Fornecedorrepository.save(fornecedor);
        return fornecedor;
    }

}
