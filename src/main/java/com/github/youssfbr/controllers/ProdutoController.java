package com.github.youssfbr.controllers;

import com.github.youssfbr.entities.Produto;
import com.github.youssfbr.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto) throws Exception {
        return ResponseEntity.ok().body(service.save(produto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscaProduto(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> buscaTodosProdutos() {
        return ResponseEntity.ok().body(service.findAll());
    }

}
