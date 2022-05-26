package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que a classe é uma classe controladora
@RequestMapping("/hello") // Serve para montar(construção) de endpoints da api
public class HelloWorld {
	@GetMapping
	public String hello() {
		return "Mentalidades da GENERATION: Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento e Persistência // Habilidades da GENERATION: Trabalho em Equipe, Atenção aos detalhes, Proatividade e Comunicação.";
	}
}
