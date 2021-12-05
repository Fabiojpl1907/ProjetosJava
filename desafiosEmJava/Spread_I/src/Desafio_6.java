import java.util.Scanner;

public class Desafio_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;

        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();


            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada

            if(  x1 == x2 && y1 == y2  ) System.out.println("0"); // mesma casa

            else if( x1 == x2 || y1 == y2  ) System.out.println("1");  // Movimento na linha ou na coluna

             // o movento diagonal sera sempe propocional
            // a quantidade de linhas que andar , devo andar o mesmo numeros de casa
            else if( Math.abs(x1 - x2 ) == Math.abs(y1 - y2 )  ) System.out.println("1"); // 1 movimento em diagonal
            else System.out.println("2"); // movimento difrente

        }
        sc.close();
    }

}

// Codigo base DiO
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if(        )
                System.out.println("0");
            else if(                 )
                System.out.println();
            else if(                  )
                System.out.println(   );
            else
                System.out.println("2");
        }
        sc.close();
    }
}*/
