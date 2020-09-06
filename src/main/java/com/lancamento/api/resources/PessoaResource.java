package com.lancamento.api.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lancamento.api.model.domain.Pessoa;
import com.lancamento.api.model.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService objService;
	
	//listar pessoas
	@GetMapping
	public ResponseEntity<List<Pessoa>> listar() {
		List<Pessoa> pessoas = objService.listar();
		return ResponseEntity.ok().body(pessoas);
	}
	//buscar por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa>buscar(@PathVariable Integer id){
		Pessoa pessoa = objService.buscar(id);
		return ResponseEntity.ok().body(pessoa);
	}
	
	//salvar pesssoa
	@PostMapping
	public ResponseEntity<Pessoa> salvar(@Valid @RequestBody Pessoa pessoa) {
		objService.salvar(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoa.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	//deletar pessoa
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		objService.excluir(id);
		return ResponseEntity.noContent().build();
	}

	//altear
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> alterar(@RequestBody Pessoa pessoa,@PathVariable Integer id) {
		objService.alterar(pessoa, id);
		return ResponseEntity.noContent().build();
	}
}
