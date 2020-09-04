package com.lancamento.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lancamento.api.model.domain.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

}
