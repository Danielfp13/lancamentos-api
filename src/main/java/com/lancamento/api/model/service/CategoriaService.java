package com.lancamento.api.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lancamento.api.model.domain.Categoria;
import com.lancamento.api.model.repository.CategoriaRepository;



@Service
public class CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> listar() {
		return categoriaRepository.findAll();
	}
	
	public Categoria salvar(Categoria obj) {
		obj = categoriaRepository.save(obj);
		return obj;
	}
}
