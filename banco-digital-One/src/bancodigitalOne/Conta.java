package bancodigitalOne;

public abstract  class Conta  implements iConta {
	
	// atributos
	
    private static final int AGENCIA_PADRAO = 1;
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	

}
