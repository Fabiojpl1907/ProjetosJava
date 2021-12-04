package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {

//		ApplicationContext factory = new AnnotationConfigApplicationContext();
		// informar qual sera a classe de configuração
		// que ira gerenciar os beans
		
		 ApplicationContext factory = new
		 AnnotationConfigApplicationContext(AppConfig.class);
		 
		 
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("100 Anos de Solidão");
		livro.setCodigo("100");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Gabriel Garcia Marques");
		
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();
	}

}
