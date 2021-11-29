package bancodigitalOne;

public class ContaPoupanca  extends Conta{
	
	public ContaPoupanca( Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void  imprimirExtrato(String tipo) {
		
		super.imprimirDadosConta(tipo);
		
}

}

