package com.lancamento.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lancamento.api.model.domain.Categoria;
import com.lancamento.api.model.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;
	@GetMapping
	public ResponseEntity<List<Categoria>> listar() {
		return ResponseEntity.ok().body(categoriaService.listar());
		
	}
}
