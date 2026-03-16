package com.fundamentalsofsoftwarearchitecture.layered.service;

import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.Cliente;
import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.dto.ClienteDTO;
import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.enums.StatusCliente;
import com.fundamentalsofsoftwarearchitecture.layered.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        return clienteRepository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    
    public void desativar(Long id){
        Cliente cliente = this.buscarPorId(id);
        cliente.setStatus(StatusCliente.DEACTIVE);
        clienteRepository.save(cliente);
    }
}
