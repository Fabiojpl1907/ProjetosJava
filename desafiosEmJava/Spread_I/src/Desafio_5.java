import java.io.IOException;
import java.util.Scanner;

public class Desafio_5 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        // informar quantos numeros serão fornecidos
        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {

            // fornecer o N numeros a sera analisados
            int X = leitor.nextInt();

            // Modulo ou resto é a operação de mostrar o resto de uma divisao
            // a divisão entre numeros pares nunca tem resto ( zero )
            // toda divisão entre numeros impares tem resto
            // em java o modulo é a divisão feito com o operador %

            if( X % 2 == 0 && X != 0){
                if( X > 0 ) System.out.println("EVEN POSITIVE");
                else System.out.println("EVEN NEGATIVE");
            }  else if( X == 0 ) System.out.println("NULL");

            if( X % 2 != 0 ){
                if( X > 0 ) System.out.println("ODD POSITIVE");
                else System.out.println("ODD NEGATIVE");
            }
        }

    }

}



// Codigo base DiO
/*import java.io.IOException;
  import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            //complete sua solução aqui.
        }
    }

}*/
