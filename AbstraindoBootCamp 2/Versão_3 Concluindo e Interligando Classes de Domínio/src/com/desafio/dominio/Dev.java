package com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

//    criar regras de negócio

    public void inscreverBootcamp( Bootcamp bootcamp) {
        // inserir o nome do Dev no bootcamp
        bootcamp.getDevsInscritos().add(this);

        // quando se inscreve no bootcamp
        //  todo conteudo entra em Conteudo Inscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir() {

//        Optional é uma classe que foi implementada no Java 8,
//        que tem o objetivo de simplificar os códigos, facilitando a vida dos desenvolvedores.
//        O Optional nos ajuda a evitar os erros NullPointerException, tirar a necessidade
//        da verificação (if x != null) e também a escrever um código com menos linhas e
//        mais bonito.

//       API Streams() executa várias tarefas em listas que antes precisavam ser
//       desenvolvidas na mão

//        findFirst(), que devolve o primeiro elemento encontrado em um fluxo.
//        Essa função devolve um objeto optional<T> , e caso não exista um objeto no fluxo
//        desejado o método findFirst() retorna um objeto optional<> vazio


        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();


        if( conteudo.isPresent()) {
            // contudo deve ser efetuado na sequencia apresentada no bootcamp

            // colocar dentro de conteudos concluidos
            this.conteudosConcluidos.add(conteudo.get());
            // tirar o que esta em conteudo Inscritos e completado
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            // se houve erro
            System.err.println("Voce não esta matriculado em nenhum conteudo");
        }



    }

    // este metodo nao pode ser void
    // Precisa retornar o toal de XP
    public double calcularTotalXp() {

        // opcao tradicional
/*        return this.conteudosConcluidos
                .stream()
                .mapToDouble( conteudo -> conteudo.calcularXp())
                .sum();*/


//        mapToDouble : Retorna um fluxo de dados tipo double,
//        que consiste nos resultados da aplicação da função fornecida aos elementos deste fluxo.

        // opção method reference
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

    }


//    criar Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

// imlementar os métodos equals e hascode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }


} // final de DEv
