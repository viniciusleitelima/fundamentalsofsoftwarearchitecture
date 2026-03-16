package com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.dto;


import java.io.Serializable;

public class ItemPedidoDTO implements Serializable {

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    private Long produtoId;
    private Integer quantidade;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
