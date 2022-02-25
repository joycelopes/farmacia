package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	List<Produto> findByPrecoBetween(BigDecimal inicio, BigDecimal fim);
	
	List<Produto> findAllByNomeContainingIgnoreCaseAndLaboratorioContainingIgnoreCase(String nome, String laboratorio);
	
}
	
	
	