package bancodigitalOne;

public abstract  class Conta  implements iConta {
	
	// atributos
	
    private static final int  AGENCIA_PADRAO =  1;
	
	protected int agencia;
	protected  int numero;
	protected  double saldo; 
	
	//Construtor
	// valor sequencial  controlada pela propria classe
	private static int SEQUENCIAL = 1;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO ;  
		this.numero = SEQUENCIAL++;
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
	
	public int getCc_agencia() {
		return agencia;
	}

	public int getCc_numero() {
		return numero;
	}

	public double getCc_saldo() {
		
		return saldo;
	}

	// mplementado a clase abstrata iConta 
	
	@Override
	public void sacar(double valor) {
		saldo -=  valor; 
		
	}

	@Override
	public void depositar(double valor) {
		saldo +=  valor; 
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		// usando poo e aproveitando metodos 
		// sacar da conta que esta transferindo
		this.sacar(valor);		
		// depositar na conta destino
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirDadosConta() {
		System.out.println(String.format("Agencia %d", this.agencia)) ;
		System.out.println(String.format("Conta %d", this.numero)) ;
		System.out.println(String.format("Saldo %.2f", this.saldo)) ;
	}

	
	
	
	
	

}
