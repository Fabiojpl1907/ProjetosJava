package com.desafio.dominio;

public abstract class Conteudo {

//    classes abstratas não podem ser instanciadas

//   final indica que estamos criando uma constante
//  Static significa que pode ser acessada fora da classe
//  Protected indica que quem vai poder acessar são as classes filhas
    protected static final double XP_PADRAO = 10d;

//  atributos comuns aos conteudos de um Bootcamp
    private String titulo;
    private String descricao;

//    Ao criar um método abstract
//    obrigo as classes filhas a implementarem este método
//    a classe que contem este método tera que ser também abstrata
    public abstract double calcularXp();


 // Get e Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
