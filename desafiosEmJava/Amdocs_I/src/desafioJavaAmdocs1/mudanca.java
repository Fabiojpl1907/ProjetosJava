package desafioJavaAmdocs1;

import java.io.IOException;
import java.util.Scanner;

public class mudanca {

    public static void main(String[] args) throws IOException {
      
		Scanner leitor = new Scanner(System.in);
		
		
		while ( leitor.hasNext() ) {
			
			  int graus = leitor.nextInt();
			  
			  if (  graus < 90 || graus == 360  ) System.out.println("Bom Dia!!");
			  else if( graus < 180 ) System.out.println("Boa Tarde!!");
  		  else if( graus < 270 ) System.out.println("Boa Noite!!");
  		  else if( graus < 360 ) System.out.println("De Madrugada!!");
			  else System.out.println("Bom Dia!!");
    }
    
 }

}