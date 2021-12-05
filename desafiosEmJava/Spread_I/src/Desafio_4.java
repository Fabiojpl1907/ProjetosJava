import java.util.Scanner;

public class Desafio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

        // condiderar dia com 24 horas para efeito de conta
        if( horasaida == 0 ) horasaida = 24;

        int ajuste = horasaida + tempoviagem + fuso;

        if ( ajuste >=24 ) ajuste -= 24;

        System.out.println(ajuste);

        sc.close();
    }

}



// Codigo base DiO

//import java.util.Scanner;

/*
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();


        //Escreva a sua lógica aqui


        System.out.println(ajuste);

        sc.close();
    }
}*/
