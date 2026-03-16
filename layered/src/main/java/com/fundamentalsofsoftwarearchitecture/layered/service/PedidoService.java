package com.fundamentalsofsoftwarearchitecture.layered.service;

import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.Cliente;
import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.enums.StatusCliente;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.ItemPedido;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.Pedido;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.dto.ItemPedidoDTO;
import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.enums.StatusPedido;
import com.fundamentalsofsoftwarearchitecture.layered.domain.produto.Produto;
import com.fundamentalsofsoftwarearchitecture.layered.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    public Pedido criarPedido(Long clienteId, List<ItemPedidoDTO> itensDTO) {

        if(itensDTO.isEmpty()) {
            throw new RuntimeException("Pedido precisa ter produtos");
        }
        Cliente cliente = clienteService.buscarPorId(clienteId);

        verificaElegibilidadeCliente(cliente);

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setDataPedido(LocalDateTime.now());

        Set<ItemPedido> itens = new HashSet<>();

        for (ItemPedidoDTO dto : itensDTO) {

            Produto produto = produtoService.buscarPorId(dto.getProdutoId());

            ItemPedido item = new ItemPedido();
            item.setPedido(pedido);
            item.setProduto(produto);
            item.setQuantidade(dto.getQuantidade());
            item.setPreco(produto.getPreco());

            itens.add(item);
        }

        pedido.setItens(itens);

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido buscarPorId(Long id){
        return pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Nao existe pedido com esse id"));
    }

    public void atualizarStatus(Long id, StatusPedido statusPedido) {
        Pedido pedido = this.buscarPorId(id);
        pedido.setStatus(statusPedido);
        pedidoRepository.save(pedido);
    }

    private void verificaElegibilidadeCliente(Cliente cliente) {
        if (StatusCliente.ACTIVE.equals(cliente.getStatus())) {
            return;
        }
        throw new RuntimeException("Cliente desativado");
    }
}
