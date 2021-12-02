package br.com.InversaoDeControle;

// Fase 1 
//dentro deste formato muitas responsabilidades  ficam dentro da classe Pedidos 

//public class Pedido {
//
//	public static void main(String[] args) { 
//
//		Pedido pedido = new Pedido();
//		
//		pedido.gravar();
//		
//		
//		
//	}
//	
//	// chamar a classe enviar emails com nome de enviar  
//	private EnviarEmails enviar;
//
//	public void gravar(){
//	 this.enviar = new EnviarEmails("smtp","tudo@paracasa.com.br", "123");
//	 this.enviar.retornar("Pedido criado");
//	}
//
//
//}


// Fase 2 - Inversão de Controle - Manual 
// classe pedido fica responsavel por somente enviar pedido 

// o que foi feito manual neste exemplo , o IoC controler do Spring faria para nós

public class Pedido {

	public static void main(String[] args) { 

		Pedido pedido = new Pedido();
		
		pedido.gravar();
		
		
	}
	
	// colocando a Inversão de controle
	// trazendo os dados do metodo statico 
	
	private EnviarEmails enviar = EnviarEmails.obterDadosEmails();

	public void gravar(){
	 this.enviar.retornar("Pedido criado");
	}


}