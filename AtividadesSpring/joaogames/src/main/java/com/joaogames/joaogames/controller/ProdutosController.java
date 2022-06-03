package com.joaogames.joaogames.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaogames.joaogames.model.Produtos;
import com.joaogames.joaogames.repository.ProdutosRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produtos>> getByName(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/valormaiorque={preco}")
	public ResponseEntity<List<Produtos>> greaterThan (@PathVariable float preco) {
		return ResponseEntity.ok(repository.findByPrecoGreaterThan(preco));
	}
	
	@PostMapping
	public ResponseEntity<Produtos> post (@RequestBody Produtos produtos) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produtos));
	}
	
	//put
	@PutMapping
	public ResponseEntity<Produtos> pu(@Valid @RequestBody Produtos produtos) {
		return ResponseEntity.ok(repository.save(produtos));
	}

	//delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
