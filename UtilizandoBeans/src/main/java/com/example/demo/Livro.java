package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {
	
	private String nome;
	private String codigo;
	
	// chamar interface autor livro
	// injetar a dependencia - Autowired
	
	@Autowired
	AutorLivro autorLivro;
	
	
	// criar get e set Autor livro
	
	public AutorLivro getAutorLivro() {
		return autorLivro;
	}
	public void setAutorLivro(AutorLivro autorLivro) {
		this.autorLivro = autorLivro;
	}
	
	

	// criar get e set livro
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void exibir() {
		System.out.println("Livro : "+ this.nome + " - Codigo : " + this.codigo);
		autorLivro.exibirAutor();
		
	}
	

}
