package com.fundamentalsofsoftwarearchitecture.layered.repository;

import com.fundamentalsofsoftwarearchitecture.layered.domain.pedido.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
