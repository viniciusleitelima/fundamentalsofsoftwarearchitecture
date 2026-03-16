package com.fundamentalsofsoftwarearchitecture.layered.service;

import com.fundamentalsofsoftwarearchitecture.layered.domain.produto.Produto;
import com.fundamentalsofsoftwarearchitecture.layered.domain.produto.dto.ProdutoDTO;
import com.fundamentalsofsoftwarearchitecture.layered.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setEstoque(produtoDTO.getEstoque());
        produto.setNome(produtoDTO.getNome());
        produto.setPreco(produtoDTO.getPreco());
        return produtoRepository.save(produto);
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }
}
