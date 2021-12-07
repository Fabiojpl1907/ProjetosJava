package com.desafio.dominio;

import com.sun.source.doctree.SeeTree;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    // atributos

    private String nome;
    private String descricao;
    // como datas não podem ser alterads , são criadas como constantes
    // considerar a data de inscrição a data atual
    private final LocalDate dataInicial = LocalDate.now();
    // bootcamp termina 45 dias aposa inscrição
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    // criar gruoo de dev que esyão incritos em um bootcamp
    // como cada pessao é unica e uma mesma pessoa nao pode aprecer 2 vezes
    // no mesmo bootcamp o grupo sera criado por Set<>.
    // como a ordem de DEv é irrelevante e vamos usar HashSet<> elementos não são ordenados
    private Set<Dev> devsInscritos = new HashSet<>();

    // criar grupo de conteudo do bootcamp
    // como a ordem de inserção é importante ,
    // é usado LinkedHashSet<>
    private Set<Conteudo> conteudos = new LinkedHashSet<>()

// gerar Get e Set
// para constantes os Set não são criados visto que não serao alterados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // como são constantes
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

} // final de Bootcamp
