package com.example.pipeline.model;

import java.math.BigDecimal;

public class PaymentRequest {
    private String clienteId;
    private BigDecimal valor;
    private String cartao;
    private boolean autorizado;

    public PaymentRequest() {
    }

    public PaymentRequest(String clienteId, BigDecimal valor, String cartao, boolean autorizado) {
        this.clienteId = clienteId;
        this.valor = valor;
        this.cartao = cartao;
        this.autorizado = autorizado;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
}
