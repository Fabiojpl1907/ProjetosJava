import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        int n ,fatorial = 1 ;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        while ( n > 0 ) {
                fatorial *= n--;
        }
        System.out.println(fatorial);
    }
}
 /*Ler um valor N. Calcular e escrever seu respectivo fatorial.
        Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Nota : nao é possivel efetuar fatorial de numero menor que 0
  */

// codigo base DiO

/*import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {

        //complete o código com sua solução


    }
}*/
