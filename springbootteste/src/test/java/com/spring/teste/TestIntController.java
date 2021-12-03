package com.spring.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

// classe para teste de integração 


// inserir anotão que esta embutida no SpringBootTest
// para usar alguns recursos de unit jupiter

@WebMvcTest    // usada para fazer testes de requisições 
@ExtendWith( SpringExtension.class)
public class TestIntController {
	
	// Mock responsavel para fazer requisicao no servidor
	
	
	@Autowired
	private MockMvc mvc;
	
	
	// colocar tratamento de excessão caso nao seja declarado nada 
	
	// 1 - teste sem passar valor , então é usado o default
	@Test
	public void testeint() throws Exception {
		
		RequestBuilder requisicao = get("/test");
		MvcResult resultado = mvc.perform(requisicao).andReturn();
		assertEquals("Bem vindo, Dio", resultado.getResponse().getContentAsString());
		
		
	}
	
	// 2 - teste passando  valor ao get 
	
	@Test
	public void testeintComArgumento() throws Exception {
		
		mvc.perform( get("/test?nome=Fabio"))
			.andExpect(content().string("Bem vindo, Fabio" ));		
	}
	
	
	

}
