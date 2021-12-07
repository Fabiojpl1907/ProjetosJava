package com.desafio.dominio;

import java.time.LocalDate;

//Para indicar que uma classe é filha ( herda características da classe pai )
// uso “extends nomeclassepai “,
// tudo que tenho na classe pai , passa para a classe filha

public class Mentoria extends Conteudo {

    // atributos
    // tiramos titulo e descricao que agora é herdado da classe pai
    // mantemos somente  os atributos exclusivos da classe mentoria

    private LocalDate data;

    // criar construtor vazio
    public Mentoria() {
    }


    // metodos

    // Como a classe conteudo é abstrata , ao fazer o extend ,
    // a ide solicita que implememtemos na classe filha
    // o metodo abstrato existente na classe filha

    @Override
    public double calcularXp() {
        // regra : ao iniciar uma mentoria
        // adicionamos  + 20xp
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // toString


//    Como agora titulo e descrição vem da classe conteudo e lá eles são privados .
//    para utilizados deve se lançar mão dos metodos get criados na classe pai (Conteudo)

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


} // final Mentoria
