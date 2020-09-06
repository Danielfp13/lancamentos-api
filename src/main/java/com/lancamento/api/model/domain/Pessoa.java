package com.lancamento.api.model.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pessoa")
@Valid
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "O campo nome deve ser preenchido")
	private String nome;

	@NotNull(message = "O campo ativo deve ser preenchido")
	private Boolean ativo;

	@Embedded
	private Endereco endereco;
	
	
	

	public Pessoa(Integer id, @NotNull(message = "O campo nome deve ser preenchido") String nome,
			@NotNull(message = "O campo ativo deve ser preenchido") Boolean ativo, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.endereco = endereco;
	}


	public Pessoa(Integer id, @NotNull(message = "O campo nome deve ser preenchido") String nome,
			@NotNull(message = "O campo ativo deve ser preenchido") Boolean ativo, String lougradouro, String numero, 
			String complemento, String bairro, String cep, String cidade, String estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.endereco.setLougradouro(lougradouro);
		this.endereco.setNumero(numero);
		this.endereco.setComplemento(complemento);
		this.endereco.setBairro(bairro);
		this.endereco.setCep(cep);
		this.endereco.setCidade(cidade);
		this.endereco.setEstado(estado);	
	}

	
	public Pessoa() {

	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
