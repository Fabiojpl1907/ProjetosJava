package bancodigitalOne;

public class ContaCorrente extends Conta {
	
	public ContaCorrente( Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void  imprimirExtrato(String tipo) {
		
		super.imprimirDadosConta(tipo);
		
		
	}

}

