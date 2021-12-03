package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Versão 1 - usada em teste unitário 
// linhas 11 a  22 

// colocar anotação do Spring Framework

/*@RestController
public class TesteController {
	
	// anotar com o tipo de requisicao a ser feita
	
	@GetMapping("/test")
	public String saudacao(String nome) {
		return String.format("Bem vindo, %s", nome);
	}

}
*/

//Versão 2 - Udada em teste de Integração 
// linhas 27 a frente

// fazer teste de comunicaoão envolve a comunicação 
// vamos alterar o controller 
// simular uma requisição por meio de parametros diferentes 
// inseriir uma requisição -> @RequestParam(name ="Nome")
// passar um valor padão



@RestController
public class TesteController {
	
	// anotar com o tipo de requisicao a ser feita
	
	@GetMapping("/test")
	public String saudacao(@RequestParam(name ="Nome",defaultValue = "DiO") String nome) {
		return String.format("Bem vindo, %s", nome);
	}

}