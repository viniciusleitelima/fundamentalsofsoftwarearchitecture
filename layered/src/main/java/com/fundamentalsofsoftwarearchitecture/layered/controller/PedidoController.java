package com.fundamentalsofsoftwarearchitecture.layered.controller;

import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.Pedido;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.dto.ItemPedidoDTO;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.enums.StatusPedido;
import com.fundamentalsofsoftwarearchitecture.layered.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{id}")
    private Pedido buscarPorId(@PathVariable Long id){
        return pedidoService.buscarPorId(id);
    }

    @PostMapping
    private Pedido salvar(Long clienteId, List<ItemPedidoDTO> itemPedidoDTOs) {
        return pedidoService.criarPedido(clienteId, itemPedidoDTOs);
    }

    @PatchMapping("/{id}")
    private void atualizarStatus(Long id, StatusPedido statusPedido){
        pedidoService.atualizarStatus(id, statusPedido);
    }

    @GetMapping
    private List<Pedido> listarPedidos(){
        return pedidoService.listarPedidos();
    }
}
