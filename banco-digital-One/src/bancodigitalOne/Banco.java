package bancodigitalOne;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	
	private String ban_nome;
	private int comprimento;
	
	
//	public List<Conta> contas = new ArrayList<Conta>();
	public List<Conta> contas;
	
	public String getBan_nome() {
		return ban_nome;
	}

	public void setBan_nome(String ban_nome) {
		this.ban_nome = ban_nome;
	} 
	
	public void nomeBanco() {
		comprimento = ban_nome.length() + 4;
		System.out.println( "_".repeat(comprimento));
		System.out.println("| "+ ban_nome + " |");
		System.out.println( "_".repeat(comprimento) + "\n");
		
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;

	}


}
