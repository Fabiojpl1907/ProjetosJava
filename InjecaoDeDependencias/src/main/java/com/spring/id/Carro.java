package com.spring.id;

public class Carro implements Veiculo {
	
	@Override  // metodo modificado 
	public void acao() {
		System.out.println("É um carro ");
	}

}
