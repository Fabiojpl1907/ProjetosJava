package com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;

//    Cada aluno so pode se increver uma unica vez em cada curso
//    nao pode se increver 2 vezes o mesmo curso ou mentoria
//    Set -> representa grupos de elementos sem duplicatas, ou seja, são usados quando
//    o programador não precisa ou não pode  ter nenhum dado duplicado na coleção
//    LinkedHashSet<> : Os elementos continuam na ordem que são inseridos
//    tambem aplicamos o conceito de heranca e polimorfismo , pois ao criar a classe Conteudo
//    nao precisamos repiter os Set<> para cursos e outro para mentoria
//    temos um grupo ( Set<>) do tipo LinkedHashSet<>  : Polimorfismo
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

//    criar metodos
//    as logicas serão implenetadas em uma fase posterior
//      agora estamos pensando nos metodos necessarios dentro da lógica de negocio

    public void inscreverBootcamp( Bootcamp bootcamp) { }

    public void progredir() {}

    public void calcularTotalXp() {}

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
//  para detalhes ver o curso de collections

//    O método equals é utilizado para comparações.
//    A classe String e as classes Wrapper sobrescrevem equals()
//    para garantir que dois objetos desses tipos, com o mesmo conteúdo,
//    possam ser considerados iguais. ...
//    Existem situações onde não queremos que uma classe seja considerada,
//    em hipótese alguma, idêntica à outra

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

//    O códigos de hashing são geralmente utilizados para determinar em qual local,
//    no conjunto, ele deve ser armazenado. Sendo, posteriormente,
//    utilizado para fazer uma pesquisa dentro do próprio conjunto
//    Tabela Hash [também conhecida como Tabela de Dispersão ou Tabela de Espalhamento]
//    é uma tabela onde as informações são armazenadas conforme um "numero hash" calculado
//    com base nas propriedades da informação. Isso permite que seja muito rápido recuperar
//    uma informação na tabela.

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }


} // final de DEv
