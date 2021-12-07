import com.desafio.dominio.Curso;
import com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // instanciar as classes
//         a classe é a planta de uma casa
//         o objeto criado/instanciado é a casa construida
//         com as caracteriticas da planta fornecida

        Curso curso1 = new Curso();

        // testar se o curso1 foi criada
        // ira mostrar a matrix Curso1 com elelmntos null
        // pois nao fornecemos ainda estes atributos
        System.out.println( curso1 );

        // para forncer os atributos usamos os metodos set criados anteriormente
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Entender na pratica o paradigma POO usando Java");
        curso1.setCargaHoraria(9);
        System.out.println( curso1 );

        // criar Curso2
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SpringBoot");
        curso2.setDescricao("Construir programas com o Framework Spring Boot");
        curso2.setCargaHoraria(15);
        System.out.println( curso2 );

        // ciando mentoria
        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Apresntar paradigma POO em Java");
        // informar para assumir a data em que esta fazendo a atribuição ( set)
        mentoria1.setData( LocalDate.now());
        System.out.println( mentoria1 );




    } // final psvm
} // final Main
