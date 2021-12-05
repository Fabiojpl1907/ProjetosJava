import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Impares {

    public static void main(String[] args)  throws IOException {
        int soma = 0 ;
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if( n1 >  n2 ){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for ( int i = n1+1 ; i < n2 ; i++ ){
            if( i % 2 != 0 ) soma += i;
        }

        System.out.println(soma);

    }


}


// codigo original DiO
//Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

/*
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);


        //Complete o código

    }
}*/
