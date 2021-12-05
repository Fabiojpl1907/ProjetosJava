import java.io.IOException;
import java.util.Scanner;

public class Desafio_5 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {

            int X = leitor.nextInt();

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
