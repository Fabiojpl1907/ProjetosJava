package bancodigitalOne;

public abstract  class Conta  implements iConta {
	
	// atributos
	
    private static final String  AGENCIA_PADRAO =  "0001";
	
    // toda conta tem 
    protected String  agencia;	
	protected  int numero;
	protected  double saldo; 
	protected Cliente  cliente;	
	
	//Construtor
	// valor sequencial  controlada pela propria classe
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO ;  
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
// metodos -> foi criada uma interface iConta 
//	public void sacar() {
//			
//		}
//		
//	public void depositar() {
//			
//		}
//	
//	public void transferir() {
//		
//	}

	
	
// geters 
	
	public String getCc_agencia() {
		return agencia;
	}

	public int getCc_numero() {
		return numero;
	}

	public double getCc_saldo() {
		
		return saldo;
	}

	// Implementado a classe abstrata iConta 
	
	@Override
	public void sacar(double valor) {
		saldo -=  valor; 
		
	}

	@Override
	public void depositar(double valor) {
		saldo +=  valor; 
		
	}

	@Override
	public void transferir(double valor, iConta contaDestino) {
		
		// usando poo e aproveitando metodos 
		// sacar da conta que esta transferindo
		this.sacar(valor);		
		// depositar na conta destino
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirDadosConta( String tipo) {
		
		System.out.println(String.format("Titular : %s", this.cliente.getCli_nome())) ;
		System.out.println("-------------------------------");
		System.out.println( "--- Extrato Conta " + tipo +  " ---") ;
		System.out.println("-------------------------------");
		System.out.println("Agencia : " + this.agencia) ;
		System.out.println(String.format("Conta   : %d", this.numero)) ;
		System.out.println(String.format("Saldo   : %.2f", this.saldo)) ;
		System.out.println("-------------------------------\n");
	}

	

}
