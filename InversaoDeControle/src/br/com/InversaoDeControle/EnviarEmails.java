package br.com.InversaoDeControle;

// Fase 1 

//public class EnviarEmails {
//	
//	// construtor de enviar emails
//	
//	public EnviarEmails(String tipo, String endereco, String senha) {
//		
//	}
//	
//	
//	// retorna quando o email é enviado
//	public void retornar( String mensagem) {
//		System.out.println("Email Enviado !");
//		
//	}
//	
//
//}

// Fase 2 - Inversão de controle 
// esta classe fica responssavel or trar tudo referente ao envio de pedido

public class EnviarEmails {
	
	// construtor de enviar emails
	
	public EnviarEmails(String tipo, String endereco, String senha) {
		
	}
	
	public static EnviarEmails obterDadosEmails() {
		return new EnviarEmails("smtp","tudo@paracasa.com.br", "123");
		
	}
	
	
	// retorna quando o email é enviado
	public void retornar( String mensagem) {
		System.out.println("Email Enviado !");
		
	}
	

}