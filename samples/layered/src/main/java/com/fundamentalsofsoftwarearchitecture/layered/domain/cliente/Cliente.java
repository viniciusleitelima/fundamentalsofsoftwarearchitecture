package com.fundamentalsofsoftwarearchitecture.layered.domain.cliente;

import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.enums.StatusCliente;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.Pedido;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    public Cliente(Long id, String nome, StatusCliente status, Set<Pedido> pedidos) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.pedidos = pedidos;
    }

    public Cliente() {
    }

    @Column(nullable = false)
    private StatusCliente status;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusCliente getStatus() {
        return status;
    }

    public void setStatus(StatusCliente status) {
        this.status = status;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
