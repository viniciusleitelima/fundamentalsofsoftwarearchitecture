package com.fundamentalsofsoftwarearchitecture.layered.repository;

import com.fundamentalsofsoftwarearchitecture.layered.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
