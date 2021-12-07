package com.desafio.dominio;

public class Curso {

    // atributos
   // boa prática : definir modificadores de acesso
    // ( indicadores de nível de visibilidade do atributo ) .
    // Se não colocar nada é public
   // Os atributos foram protegidos ( encapsulado ) dentro da sua classe .
    // Não são diretamente acessíveis fora dela .
    // para acessalos vao precisar o metodos que foram criados como publicos

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    // criar constutor vazio
    //  Cria-se construtor par que na criação do objeto já sejam passados os atributos
   //  e o constructor não é criado , um construtor vazio é criado pelo propiônico java em “back-end”

    public Curso() {
    }


    // criar métodos Getters e Setters
    // Criar get / set que permitam ajustar o valor de um atributo ou
    // obter qual valor o atributo tem em determinado momento
    // os etodos são publicos para poderem ser acessados por outras classes

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // criar toString para poder imprimir
    // e ver se ficou tudo direito
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


} // final Curso
