package bancodigitalOne;

public class DigitalOne {
	
	//classe de acesso e trabalho 

	public static void main(String[] args) {
		
		// quando chama o construtor conta ja gera agencia e numero 
		
		// criando conta Corrente 
		Conta cc = new ContaCorrente();
		
		// criando conta Poupança 
				Conta cp = new ContaPoupanca();
				
	 // imprimir extrato conta
				
				cc.imprimirExtrato();
				cp.imprimirExtrato();
				
		}

}
