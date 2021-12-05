import java.util.Scanner;
import java.math.BigInteger;

public class Desafio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Entrada: Nùmero de casos de teste
        int n = sc.nextInt();

        //Loop de casos de teste

        for (int i = 0; i < n; i++) {

            //Entrada: Número de quadrados do tabuleiro
            int x = sc.nextInt();

            //Iniciando a qtd de grãos em 0
            BigInteger qtdGraos = BigInteger.valueOf(0);

            //Loop para calcular a qtd de grãos
            for (int j = 0; j < x; j++) {

                //Calcula a qtd de graos no tabuleiro
                qtdGraos = qtdGraos.add((BigInteger.valueOf(2)).pow(j));
            }
            //Lógica matemática: qtdGraos = 2^0 + 2^1 + 2^2 + .... + 2^(x-1) .
            // Onde x = Número de quadrados do tabuleiro
            //Calculo o peso em Kg.
            BigInteger quantKg = qtdGraos.divide(BigInteger.valueOf(12000));

            System.out.println(quantKg + " kg");
        }
    }
}
// Solução apresentada e explicada por :  Henrique Rodrigues

//Codigo base DiO

/*

//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            System.out.printf(                     );   //Complete o código aqui.
        }
        sc.close();
    }
}*/