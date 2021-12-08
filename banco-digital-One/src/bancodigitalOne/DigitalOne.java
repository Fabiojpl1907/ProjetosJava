package bancodigitalOne;


public class DigitalOne {
	
	// Digital One 
	// Crie seu próprio banco digital 


	public static void main(String[] args) {
		
		// Criar banco
		Banco bc = new Banco();
		bc.setBan_nome("Bank One Digital");
		
		// Criar cliente
		Cliente cli = new Cliente();
        cli.setCli_nome("Fábio José")	;	
        
		
    	// criando conta Corrente 		
		// quando chama o construtor conta ja gera agencia e numero 
		
		Conta cc = new ContaCorrente(cli);
		cc.depositar(100);
       
	
		// Adicionando conta no grupo de contas do banco
		bc.getContas().add(cc);
		System.out.println("____>>> Conteudos  : " + bc.getContas());
		
		// criando conta Poupança 
		Conta cp = new ContaPoupanca(cli);
		cc.transferir(47.15, cp);
		bc.getContas().add(cp);

		
		System.out.println(   "-----------------------" );
		System.out.println(   bc.getContas() );
		System.out.println(   "-----------------------" );
				
	 // imprimir extrato conta
	
	    bc.nomeBanco();
		cc.imprimirExtrato("Corrente");
		cp.imprimirExtrato("Poupança");
		
		

				
		}

}
