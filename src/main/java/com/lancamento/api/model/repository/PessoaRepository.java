package com.lancamento.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lancamento.api.model.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {
	@Query( value="SELECT * FROM pessoa p where p.id = :id ",nativeQuery=true )
	Pessoa findPessoa(Integer id);
}
