package com.lancamento.api.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.lancamento.api.model.domain.Pessoa;
import com.lancamento.api.model.repository.PessoaRepository;
import com.lancamento.api.model.service.exception.DataIntegrityException;
import com.lancamento.api.model.service.exception.ObjectNotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository objRepository;

	public List<Pessoa> listar() {
		List<Pessoa> pessoas = objRepository.findAll();
		return pessoas;
	}

	public Pessoa buscar(Integer id) {
		Pessoa pessoa = objRepository.findPessoa(id);
		if (pessoa == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!" + id + ", tipo " + Pessoa.class.getName());
		}
		return pessoa;
	}

	// salvar
	public Pessoa salvar(Pessoa pessoa) {
		pessoa = objRepository.save(pessoa);
		return pessoa;
	}

	// deletar
	public void excluir(Integer id) {
		buscar(id);
		try {
			objRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir");
		}
	}
	
	//alterar
	public Pessoa alterar(Pessoa pessoa, Integer id) {
		buscar(id);
		pessoa.setId(id);
		return objRepository.save(pessoa);
		}

}
