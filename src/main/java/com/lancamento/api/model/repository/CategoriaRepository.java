package com.lancamento.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lancamento.api.model.domain.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria,Integer>{

	@Query( value="SELECT * FROM categoria c where c.codigo = :codigo ",nativeQuery=true )
	Categoria findOne(Integer codigo);
}
