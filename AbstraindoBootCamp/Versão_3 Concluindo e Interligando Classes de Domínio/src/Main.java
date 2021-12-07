import com.desafio.dominio.Bootcamp;
import com.desafio.dominio.Curso;
import com.desafio.dominio.Dev;
import com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Entender na pratica o paradigma POO usando Java");
        curso1.setCargaHoraria(9);

        // criar Curso2
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SpringBoot");
        curso2.setDescricao("Construir programas com o Framework Spring Boot");
        curso2.setCargaHoraria(15);

        // ciando mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Apresentar paradigma POO em Java");
        // informar para assumir a data em que esta fazendo a atribuição ( set)
        mentoria1.setData( LocalDate.now());

/*      testando criação curso e mentoria
        System.out.println( curso1 );
        System.out.println( mentoria1 );*/

    // criando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Promeover o conhecimento java a iniciantes na carreira Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        // Criar o Dev
        Dev dev1 = new Dev();
        dev1.setNome("Fabio Jose");

        Dev dev2 = new Dev();
        dev2.setNome("Elizabeth");

        // ver conteudos inscritos - deve estar vazio
        System.out.println("\n<< --------------------- >> ");
        System.out.println(dev1.getNome() + " -> Conteudos Inscritos : " + dev1.getConteudosInscritos() );
        System.out.println(dev2.getNome() + " -> Conteudos Inscritos : " + dev2.getConteudosInscritos() );

        // se matricular em um Bootcamp
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("\n<< --------------------- >> ");
        System.out.println(dev1.getNome() + " -> Conteudos Inscritos : " + dev1.getConteudosInscritos() );
        System.out.println(dev2.getNome() + " -> Conteudos Inscritos : " + dev2.getConteudosInscritos() );

        // conteudo concluidos ( deve estar vazio )
        System.out.println("\n<< --------------------- >> ");
        System.out.println(dev1.getNome() + " -> Conteudos Concluidos : " + dev1.getConteudosConcluidos() );
        System.out.println(dev2.getNome() + " -> Conteudos Concluidos  : " + dev2.getConteudosConcluidos() );

        // progredir no bootcamp
        dev1.progredir();
        dev2.progredir();
        System.out.println("\n<< --------------------- >> ");
        System.out.println(dev1.getNome() + " -> Conteudos Concluidos : " + dev1.getConteudosConcluidos() );
        System.out.println(dev2.getNome() + " -> Conteudos Concluidos  : " + dev2.getConteudosConcluidos() );

        // cursos ainda inscritos e não concluidos
        System.out.println("\n<< --------------------- >> ");
        System.out.println(dev1.getNome() + " -> Conteudos Inscritos : " + dev1.getConteudosInscritos() );
        System.out.println(dev2.getNome() + " -> Conteudos Inscritos : " + dev2.getConteudosInscritos() );

        // calcular XP
        System.out.println("\n<< --------------------- >> ");
        System.out.println(dev1.getNome() + " -> XP : " + dev1.calcularTotalXp() );
        System.out.println(dev1.getNome() + " -> XP : " + dev1.calcularTotalXp() );



    } // final psvm

} // final Main
