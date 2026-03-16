package com.fundamentalsofsoftwarearchitecture.layered.controller;

import com.fundamentalsofsoftwarearchitecture.layered.domain.produto.Produto;
import com.fundamentalsofsoftwarearchitecture.layered.domain.produto.dto.ProdutoDTO;
import com.fundamentalsofsoftwarearchitecture.layered.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto salvar(@RequestBody ProdutoDTO produtoDTO) {
        return produtoService.salvar(produtoDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> listarTodos(){
        return  produtoService.listarTodos();
    }

}
