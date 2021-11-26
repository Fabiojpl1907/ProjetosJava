package desafioJavaAmdocs1;


import java.io.IOException;
import java.util.Scanner;

public class Teste2{
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Forneça dimenssões do Colchão");
		
		System.out.print("Espessura do Colchão : ");
		int A = leitor.nextInt();
		
		System.out.print("Largura do Colchão : ");
		int B = leitor.nextInt();
		
		System.out.print("Comprimento  do Colchão : ");
		int C = leitor.nextInt();
		
		System.out.println("Forneça dimenssões da Porta");
		
		System.out.print("Altura da Porta  : ");
		int H = leitor.nextInt();
		
		System.out.print("Largura da Porta : ");
		int L = leitor.nextInt();
		
		// para colchão entrar 
		// altura da porta (H) maior que largura do colchao ( b)  - colchão entra deitado na vertical 
		// Largura da porta maior que largura do colchao ( b)  - colchão entra deitado  na horizontal 
		
		
		System.out.println(((H>B)||(L>B))?"S":"N");
    }
    
}