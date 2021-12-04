
function VerificarIdadeProf()
{
	volta = true;
	// verifica se data foi informada ou não
	if(document.getElementById("nasc").value != "")
	{
		// data atual
		var d = new Date;
		// extrai partes da data atual
        anoAtual = d.getFullYear();
        mesAtual = d.getMonth() + 1;
        diaAtual = d.getDate();
		// data nascimento
		dnasc = document.getElementById("nasc").value;
		// extrai partes da data nascimento
		// AAAA-MM-DD
		// 0123456789 
		diaNasc = dnasc.substr(8,2);
	    mesNasc = dnasc.substr(5,2);
	    anoNasc = dnasc.substr(0,4);
		// calcula idade
		idade = anoAtual - anoNasc;
		// verifica se pessoa já fez ou não aniversário
		// se ainda não fez aniversário, 
		// subtrai 1 ano da idade
		if (mesAtual < mesNasc || 
			mesAtual == mesNasc && diaAtual < diaNasc) 
        	idade--;
		// verifica se idade é válida para seguro de vida
		if(idade >= 18 && idade <= 65)
		{
			document.getElementById("idade").value = idade;
			}
		else
		{
			alert(idade + " anos - Idade inválida para seguro de vida");
			volta = false;
			}
	}
	else
	// data de nascimento não foi informada
	{
		alert("Data Nascimento não informada");
		volta = false;
		}
		
	// verifica profissões 
	// captura o índice (index) selecionado do select
	vp = document.getElementById("prof").selectedIndex;
	if(vp != 0)
	{
		if(vp == 6 || vp == 7)
		{
			alert(vp + " - Profissão inválida para seguro de vida");
			volta = false;
			}
	}
	else
	{
		alert(" Profissão não informada");
		volta = false;
	}
	
	// se todos os dados forem válidos (volta == true), 
	// desabilita botão "Verificar Restrições"
	// e habilita botão "Enviar"
	if(volta)
	{
		document.getElementById("verifica").disabled = true;
		document.getElementById("envia").disabled = false;
		}
		
}

	