package com.farmaciadamarcia.farmaciaDaMarcia.controller;

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

import com.farmaciadamarcia.farmaciaDaMarcia.model.Categoria;
import com.farmaciadamarcia.farmaciaDaMarcia.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable Long id) {
		return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Categoria>> GetByName(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByDescricaoCategoriaContainingIgnoreCase(nome));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> Put(@Valid @RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> AddCategoria(@Valid @RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
