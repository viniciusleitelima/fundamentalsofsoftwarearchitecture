package com.fundamentalsofsoftwarearchitecture.layered.controller;

import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.Cliente;
import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.dto.ClienteDTO;
import com.fundamentalsofsoftwarearchitecture.layered.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    private Cliente buscarPorId(@PathVariable Long id){
        return clienteService.buscarPorId(id);
    }

    @PostMapping
    private Cliente salvar(ClienteDTO clienteDTO) {
        return clienteService.salvar(clienteDTO);
    }

    @GetMapping
    private List<Cliente> listarTodos(){
        return clienteService.listarTodos();
    }

    @PatchMapping("{id}/desativar")
    private void desativar(@PathVariable Long id){
        clienteService.desativar(id);
    }

}
