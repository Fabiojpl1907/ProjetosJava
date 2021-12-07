package com.desafio.dominio;

public class Curso extends  Conteudo{

    private int cargaHoraria;

    // criar constutor vazio
    //  Cria-se construtor par que na criação do objeto já sejam passados os atributos
   //  e o constructor não é criado , um construtor vazio é criado pelo propiônico java em “back-end”

    public Curso() {
    }


    // criar métodos

    @Override
    public double calcularXp() {
//        Regra de ajuste do XP ao concluir o curso
        return XP_PADRAO * cargaHoraria;
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


} // final Curso
