package com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable {

    private String nome;

    public ClienteDTO( String nome) {
        this.nome = nome;
    }

    public ClienteDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
