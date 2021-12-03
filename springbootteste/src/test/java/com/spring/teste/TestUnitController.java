package com.spring.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Controller.TesteController;

public class TestUnitController {
	
	
	@Test
	public void testUnit() {
		
		// Instanciar a classe controle 
		// classe a ser testada
		TesteController controle = new TesteController();
		String resultado = controle.saudacao("Spring Teste");
		
		// Vamos fazer uma comparação para ver se 
		// o resultado é o esperado 
		assertEquals("Bem vindo, Spring Teste", resultado);
		
		
		
	}
	
	
	
	;
	

}
