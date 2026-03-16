package com.fundamentalsofsoftwarearchitecture.layered.domain.pedido;

import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.Cliente;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.enums.StatusPedido;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pedido {
    public Pedido(Cliente cliente, Set<ItemPedido> itens, LocalDateTime dataPedido, StatusPedido status, Long id) {
        this.cliente = cliente;
        this.itens = itens;
        this.dataPedido = dataPedido;
        this.status = status;
        this.id = id;
    }

    public Pedido(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private StatusPedido status;

    private LocalDateTime dataPedido;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Set<ItemPedido> itens = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Set<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(Set<ItemPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
