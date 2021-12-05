//import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double resultado;

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        resultado = ((Potencia((1+ Potencia(5,0.5 ))/2,n)) - (Potencia((1- Potencia(5,0.5 ))/2,n)))/ Potencia(5,0.5 ) ;

        System.out.println(new DecimalFormat(".#").format(resultado));


    }
    static double Potencia (double num, double pow){
        return Math.pow(num,pow);
    }

}

/*    A fórmula de Binet é uma forma de calcular números de Fibonacci.
        Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.*/

// Codigo base DiO
//import java.util.Locale;
//import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        //escreva o seu código aqui
//
//    }
//}
