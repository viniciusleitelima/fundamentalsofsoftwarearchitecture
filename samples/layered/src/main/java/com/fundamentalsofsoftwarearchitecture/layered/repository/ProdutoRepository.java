package com.fundamentalsofsoftwarearchitecture.layered.repository;

import com.fundamentalsofsoftwarearchitecture.layered.domain.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
