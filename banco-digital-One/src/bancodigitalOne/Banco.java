package bancodigitalOne;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Banco {
	
	private String ban_nome;
	private int comprimento;
	// lista de contas do banco
	// como cada conta deve ser unica no mesmo banco 
	// foi utilizado  LinkedHashSet<>
	private Set<iConta> contas = new LinkedHashSet<>();
    
	
   
	
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

	public Set<Conta> getContas() {
		return contas;
	}

	public void setContas(Set<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return Objects.equals(contas, other.contas);
	}




	
	
	
	
	
}
