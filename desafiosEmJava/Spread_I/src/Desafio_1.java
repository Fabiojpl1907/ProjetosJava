//Solução 1

/* import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();

        if( L % 2 != 0 ) {
            if( C % 2 != 0 ) System.out.println("1");
            else System.out.println("0");

        }

        if( L % 2 == 0 ) {
            if( C % 2 == 0 ) System.out.println("1");
            else System.out.println("0");
        }

        sc.close();
    }
}*/


//Solução 2 - baseado no modelo da DiO
import java.util.Scanner;

public class Desafio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if (( L + C) % 2 == 0)
            System.out.println("1");
        else                                               //complete o código nos espaços em branco
            System.out.println("0");
        sc.close();
    }
}

