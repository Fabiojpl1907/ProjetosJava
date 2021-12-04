package segurovida;

public class Segurado {
	public String nome;
	public String nascimento;
	public boolean fumante;
	public String sexo;
	public int profissao;
	public float salario;
	public int idade;
	public float mensalidade;
	public double cobertura;
	
	public void CalcularSeguro()
	{
		
		// interface vem de WEB-INF -> seguro.jsp
		
		// cálculo base do valor mensal
		/*
		 * Fórmula de cálculo do pagamento do valor mensal do seguro de vida:
		 * 
		 * 5% do salário atual; 
		 * Fumante: acréscimo de 2% sobre o salário.
		 * 
		 * Sexo masculino:
		 * 
		 * Idade entre 18 e 25: sem acréscimo; 
		 * Idade entre 26 e 45: acréscimo de 2% sobre o salário; 
		 * Idade entre 46 e 65: acréscimo de 3% sobre o salário.
		 * 
		 * Sexo feminino:
		 * 
		 * Idade entre 18 e 25: sem acréscimo; 
		 * Idade entre 26 e 45: acréscimo de 1%  sobre o salário; 
		 * Idade entre 46 e 65: acréscimo de 2% sobre o salário.
		 */
		// calculo mensalidade base 
		
		this.mensalidade =  this.salario * 0.05f;
		
		//		Fórmula de cálculo do pagamento do valor mensal do seguro de vida:
		
		if ( this.fumante) this.mensalidade +=  this.salario * 0.02f;
		
		if ( this.sexo.equals("M")) {	
			
			if ( this.idade >=26 &&  this.idade <= 45 ) this.mensalidade += this.salario * 0.02f; 
			if ( this.idade >45 &&  this.idade <= 65 ) this.mensalidade += this.salario * 0.03f; 
		}
		
		if ( this.sexo.equals("F")) {	
			if ( this.idade >=26 &&  this.idade <= 45 ) this.mensalidade += this.salario *  0.01f; 
			if ( this.idade >45 &&  this.idade <= 65 ) this.mensalidade += this.salario *  0.02f; 
		}
		
		// Definição do valor de cobertura
		/** Salário até 1.500,00: 150.000,00;
		* Salário maior 1.500,00 e até 3.000,00: 250.000,00.
		* Salário maior 3.000,00 e até 5.000,00: 350.000,00;
		* Salário maior 5.000,00: 500.000,00.*/
		
	    if ( this.salario >= 1500.0f && this.salario <= 3000.0f) this.cobertura = 250000.0f;
	    if ( this.salario > 3000.0f && this.salario <= 5000.0f) this.cobertura = 350000.0f;
	    if ( this.salario > 5000.0f ) this.cobertura = 500000.0f;
	}
	
}
