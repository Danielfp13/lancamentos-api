package com.lancamento.api.dto;

import com.lancamento.api.model.domain.Pessoa;

public class PessoaDTO {


	private Integer id;


	private String nome;

	public PessoaDTO(Pessoa obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public PessoaDTO() {

	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
