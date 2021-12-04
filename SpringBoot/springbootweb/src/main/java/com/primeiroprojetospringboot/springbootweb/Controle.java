package com.primeiroprojetospringboot.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controle {
	
	
	// Avisar que o retornoda mensage, sera a partir do endereço inicial 
	@GetMapping("/")
	public String mensagem() {
		return "Nosso primeiro projeto Spring Boot Web";
	}

}
